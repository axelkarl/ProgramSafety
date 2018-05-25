#!/bin/bash

function main {
    for i in {1..5}
    do
        dd if=/dev/urandom of="garbage${i}.ps" bs=1024 count=1
        radamsa -n 1000 < "garbage${i}.ps" | base64 - > "garbage${i}.base64"
    done
    valgrind --track-origins=yes ./psselect -e -p1 -p2 -p3 "garbage1.ps" /tmp/out.ps
    valgrind --track-origins=yes ./psselect -r -p1 -p2 -p3 "garbage2.ps" /tmp/out.ps
    valgrind --track-origins=yes ./psselect -q -p1 -p2 -p3 "garbage3.ps" /tmp/out.ps
    valgrind --track-origins=yes ./psselect -o -p1 -p2 -p3 "garbage4.ps" /tmp/out.ps
    valgrind --track-origins=yes ./psselect -p1 -p2 -p3 "garbage5.ps" /tmp/out.ps
}

main $@
exit $?
