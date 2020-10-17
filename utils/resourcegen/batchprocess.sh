#!/usr/bin/env bash

##
# Helper file to batch process execution of resourcegen.py
# This script must be located in the same directory as resourcegen.py,
# however it may reference a file from a subdirectory
#
# Formatting - entries must be on each line
#
# Usage: ./batchprocess [filepath]
##

source './bin/activate'

FILENAME=$1

# Color Utilities
COLOR=$(tput setaf 6)
RESET=$(tput sgr0)

# Check if file exists
if [ ! -f "$FILENAME" ]; then
  echo "[ERROR] $FILENAME does not exist.."
  exit 1
fi

while read -r entry; do
  echo "${COLOR}[BATCH] Processing $entry ${RESET}"
  python3 resourcegen.py --resource "$entry"
done < "$FILENAME"

deactivate
