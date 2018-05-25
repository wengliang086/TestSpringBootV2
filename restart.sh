#!/bin/sh

basepath=$(cd `dirname $0`; pwd)
cd $basepath

#新版本管理台部署 参数（1、profile；2、分支部署版本）

SERVER_PORT=8080
profile="test"

check(){
  if [ $? -ne 0 ];then
   echo "===================$1,执行失败======================="
   exit 1;
  fi
   echo "===================$1,执行成功========================"
}

project_name="TestSpringBootV2"

stop() {
    SERVER_NAME=$1
    PIDS=`ps -ef | grep java | grep "$SERVER_NAME" |awk '{print $2}'`
    if [ -z "$PIDS" ]; then
        echo "ERROR: The $SERVER_NAME does not started!"
#        exit 1
        return 0
    fi
    echo -e "Stopping the $SERVER_NAME ...\c"
    for PID in $PIDS ; do
        kill $PID > /dev/null 2>&1
    done

    COUNT=0
    while [ $COUNT -lt 1 ]; do
        echo -e ".\c"
        sleep 1
        COUNT=1
        for PID in $PIDS ; do
            PID_EXIST=`ps -f -p $PID | grep java`
            if [ -n "$PID_EXIST" ]; then
                COUNT=0
                break
            fi
        done
    done

    echo "OK!"
    echo "PID: $PIDS"
}

echo "关闭 $project_name"
stop $project_name
echo "启动 $project_name"

STDOUT_FILE=./stdout.log
#nohup java -jar business-hall-0.0.1-SNAPSHOT.jar --spring.profiles.active=dev > $STDOUT_FILE 2>&1 &
nohup java -jar TestSpringBootV2-0.0.1-SNAPSHOT.jar > $STDOUT_FILE 2>&1 &


COUNT=0
while [ $COUNT -lt 1 ]; do
    echo -e ".\c"
    sleep 1
#    COUNT=`ps -f | grep java | grep "$project_name" | awk '{print $2}' | wc -l`
    COUNT=`netstat -an | grep $SERVER_PORT | wc -l`
    if [ $COUNT -gt 0 ]; then
        break
    fi
done

echo "OK!"
PIDS=`ps -ef | grep java | grep "$project_name" | awk '{print $2}'`
echo "PID: $PIDS"
