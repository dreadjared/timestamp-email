# timestamp-email
Generates a custom email address with timestamp from the input email address.

```
java -cp path/to/directory/timestamp-email TimestampEmail yourname@example.com
yourname+2021.03.31.08.09.16@example.com
```

## Usage
```
java -cp path/to/directory/timestamp-email TimestampEmail <email-address>
```

I have it bound to a keyboard shortcut for convenience

## Compile
```
javac -classpath path/to/directory/timestamp-email TimestampEmail.java
```

## Notes
The email address stays on the clipboard for 5 seconds so paste quickly.

