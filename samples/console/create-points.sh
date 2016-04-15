#!/bin/bash

MAIN_CLASS=CreatePoints

# --- Option processing --------------------------------------------
display_usage() { 
	echo "Builds and calls main class '$MAIN_CLASS'." 
	echo -e "\nUsage: $0 [Options] hostname personallAccessToken workspaceID\n" 
	echo -e "Options:\n  -h, --help      show the help" 
	echo -e "\nEG:" 
	echo -e "  $0 local-svc.leanix.net myPAS 4846d3f1-ca14-4571-9367-ebc23ca25a47\n" 
} 

# check whether user had supplied -h or --help . If yes display usage 
if [[ ( ${@: -1} == "--help") ||  ${@: -1} == "-h" || "$#" -ne 3 ]] 
then 
	display_usage
	exit 0
fi 

# -- Body ---------------------------------------------------------
set -x
mvn compile exec:java -Dexec.mainClass=$MAIN_CLASS -Dexec.args="$1 $2 $3"
