package com.striptrips.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.striptrips.R;
import com.striptrips.dao.PackageDAO;
import com.striptrips.model.Package;
import com.striptrips.ui.adapter.PackageListAdapter;

import java.util.List;

public class PackageListActivity extends AppCompatActivity {

    final private String APP_BAR_TITLE = "Pacotes";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(APP_BAR_TITLE);
        setContentView(R.layout.activity_package_list);
        setupList();
    }

    private void setupList() {
        ListView packageList = findViewById(R.id.listview_package_list);
        List<Package> packages = new PackageDAO().lista();
        packageList.setAdapter(new PackageListAdapter(packages, this));
    }
}