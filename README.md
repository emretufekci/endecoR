# endecoR


endecoR is encryption and decryption library for Base64 using AES-128 & Cipher
 
  - Strong Base64 encryption
  - Uses Cipher Algorithm
  - Uses AES 128


## Installation

Use the software project management tool [maven](https://maven.apache.org/) to install [endecoR](https://mvnrepository.com/artifact/com.emretufekci/endecoR).

Goto pom.xml file and add this dependency

```bash
<dependency>
    <groupId>com.emretufekci</groupId>
    <artifactId>endecoR</artifactId>
    <version>0.1</version>
</dependency>
```

## Usage

### Encrypt Plain Text

- plainText: String
- secretKey: SecretKey

```
encrypt(plainText, secretKey)
```


### Decrypt Plain Text

- encryptedText: String
- secretKey: SecretKey

```
encrypt(encryptedText, secretKey)
```

### Generate Secret Key

This function will return SecretKey via using AES128
```
secretKeyGenerator()
```
### SecretKey to String

This function will convert SecretKey to String
```
SecretKey2Str(secretKey)
```

### String To SecretKey

This function will convert String to SecretKey
```
Str2SecretKey(secretKeyStr) 
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
You can feel free to use library, developed by 
[Emre](https://emretufekci.com/) and it is under
[MIT](https://choosealicense.com/licenses/mit/) license.
