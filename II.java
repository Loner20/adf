public void openWebsite(View view) {
    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
    startActivity(intent);
}

public void openDialer(View view) {
    Intent intent = new Intent(Intent.ACTION_DIAL);
    intent.setData(Uri.parse("tel:1234567890"));
    startActivity(intent);
}

public void openCamera(View view) {
    Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
    if (intent.resolveActivity(getPackageManager()) != null) {
        startActivity(intent);
    }
}
