# New Day Countdown

![](https://github.com/wannaphong/New-Day-Countdown/blob/main/New%20Day%20Countdown.png?raw=true)

This Application will help you for countdown time to new day only!

## Privacy Policy

We doesn't collect any your privacy data in our aplication. The Application doesn't need any internet to working.


## Open source

You can get the source code at [https://github.com/wannaphong/New-Day-Countdown](https://github.com/wannaphong/New-Day-Countdown)

## Releases

When a new release is published on GitHub, an Android App Bundle (AAB) file is automatically built and made available as a workflow artifact. This AAB file can be downloaded and uploaded to Google Play Store.

To create a release:
1. Go to the repository's Releases page
2. Click "Create a new release"
3. Tag the version and publish the release
4. The AAB will be built automatically and available in the workflow run artifacts

### Signing Configuration (Optional)

To build a signed AAB ready for Google Play Store upload, configure the following secrets in your repository settings (Settings → Secrets and variables → Actions):

- `KEYSTORE_BASE64`: Your keystore file encoded in base64 (run `base64 -i your-keystore.jks | tr -d '\n'` to encode)
- `KEYSTORE_PASSWORD`: Password for the keystore file
- `KEY_ALIAS`: Alias of the key in the keystore
- `KEY_PASSWORD`: Password for the key

If these secrets are not configured, the workflow will build an unsigned AAB that you'll need to sign manually before uploading to Google Play Store.


contact: wannaphong@yahoo.com
