#### The Application runs on the OLD VERSION of Spring Boot!

```
brew install vault
vault server --dev --dev-root-token-id="00000000-0000-0000-0000-000000000000"
export export VAULT_TOKEN="00000000-0000-0000-0000-000000000000"
export VAULT_ADDR="http://127.0.0.1:8200"

vault kv put secret/SpringBootVault my.username=RAHUL my.password=VAISH

```

<img width="1724" alt="image" src="https://github.com/rahulvaish/SpringBoot-Java/assets/689226/8589b173-1a15-49d2-8b89-27c6d94f7352">
<img width="1728" alt="image" src="https://github.com/rahulvaish/SpringBoot-Java/assets/689226/f6639aa2-b97f-4866-9862-1d1365c408a6">

<img width="1339" alt="image" src="https://github.com/rahulvaish/SpringBoot-Java/assets/689226/a0772cf5-6449-471a-8961-5d12bd74064f">

