from openjdk
COPY ./src/main/java/*.java /
RUN javac /Calculator.javaENTRYPOINT ["java"]