Button sub;
        sub=findViewById(R.id.button);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "login successfull", Toast.LENGTH_SHORT).show();
            }
        });
        String[] item=new String[]{"India", "Pakisthan", "China", "America",
                "England"};
        ArrayAdapter adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spinner = findViewById(R.id.country);
        spinner.setAdapter(adapter);
    }

    }
