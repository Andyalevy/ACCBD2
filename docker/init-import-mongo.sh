#!/bin/bash

set -e

mongoimport -d accidents -c accidents --type=csv --headerline --file /tmp/US_Accidents_Dec19.csv