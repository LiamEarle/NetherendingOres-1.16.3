# pylint: disable=C0325,C0103

'''
A utility for the NetherendingOres mod to generate Minecraft resource files
'''

import argparse
import logging
import json

from pathlib import Path
from jinja2 import FileSystemLoader, Environment

def main():
    ''' Main Function '''

    # Logging Setup
    logging.basicConfig(format='[%(levelname)s] %(message)s', level=logging.INFO)

    # Jinja Environment Setup
    loader = FileSystemLoader(searchpath='./templates')
    environment = Environment(loader=loader)

    # File Setup
    BLOCKSTATE_PATH = Path('./output/blockstate')
    BLOCK_MODEL_PATH = Path('./output/models/block')
    ITEM_MODEL_PATH = Path('./output/models/item')
    LANG_PATH = Path('./output/lang')
    LANG_FILE = Path(LANG_PATH / 'en_US.json')
    BLOCK_LOOT_TABLE_PATH = Path('./output/loot_tables/blocks')

    BLOCKSTATE_PATH.mkdir(parents=True, exist_ok=True)
    BLOCK_MODEL_PATH.mkdir(parents=True, exist_ok=True)
    ITEM_MODEL_PATH.mkdir(parents=True, exist_ok=True)
    LANG_PATH.mkdir(parents=True, exist_ok=True)
    LANG_FILE.touch(exist_ok=True)
    BLOCK_LOOT_TABLE_PATH.mkdir(parents=True, exist_ok=True)


    # Arguments
    parser = argparse.ArgumentParser(description='Generate Minecraft Resources')
    parser.add_argument('--modid',
                        type=str,
                        default='netherendingores',
                        help='modid for resource locations')
    parser.add_argument('--resource',
                        type=str,
                        required=True,
                        help='Name of the resource to be generated')
    parser.add_argument('--texture',
                        type=str,
                        help='Name of the texture to be generated, can be ' \
                        'omitted if the value is the same as the resource')
    parser.add_argument('--name',
                        type=str,
                        help='Sets the name of the block in the language file' \
                        ', names with multiple words must be quoted!')

    args = parser.parse_args()

    # Set some default arguments (post-processing of args)
    if args.texture is None:
        args.texture = args.resource

    if args.name is None:
        args.name = args.resource

    # Generate BlockState File
    template = environment.get_template('blockstate.j2')
    output = template.render(vars(args))
    path = BLOCKSTATE_PATH / f'{args.resource}.json'
    write_output(path, output)

    # Generate Block Model File
    template = environment.get_template('block_model.j2')
    output = template.render(vars(args))
    path = BLOCK_MODEL_PATH / f'{args.resource}_model.json'
    write_output(path, output)

    # Generate Item Model File
    template = environment.get_template('item_model.j2')
    output = template.render(vars(args))
    path = ITEM_MODEL_PATH / f'{args.resource}.json'
    write_output(path, output)

    # Generate Block Loot Table File
    template = environment.get_template('block_loot_table.j2')
    output = template.render(vars(args))
    path = BLOCK_LOOT_TABLE_PATH / f'{args.resource}.json'
    write_output(path, output)

    # Add Resource to Lang File
    lang_data = None

    # Read existing entries, or create an empty dictionary
    with open(LANG_FILE, 'r') as file:
        try:
            lang_data = json.loads(file.read());
        except json.decoder.JSONDecodeError:
            lang_data = {}

    entry_key = f'block.{args.modid}.{args.resource}'
    lang_data[entry_key] = args.name

    output = json.dumps(lang_data, indent=4, separators=(',', ': '))

    write_output(LANG_FILE, output)

def write_output(filepath, output):
    ''' Writes the given output to the filepath '''
    with open(filepath, 'w') as file:
        logging.info('Writing to %s', filepath)
        file.write(output)


if __name__ == "__main__":
    main()
