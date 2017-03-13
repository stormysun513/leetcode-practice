#!/bin/sh

classname=`basename $1 .java`
if [ "$classname" != "" ]; then
    javac $1
    java Solution
else
    echo Invalid filename.
fi

