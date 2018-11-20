





Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+918511812660"));

        if (ContextCompat.checkSelfPermission(MainActivity.this,
         Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CALL_PHONE},1);
        }
        else
        {
            startActivity(intent);
        }