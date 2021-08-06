package com.striptrips.ui.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.striptrips.R;
import com.striptrips.model.Package;
import com.striptrips.utils.CurrencyFormatterUtil;
import com.striptrips.utils.DaysFormatterUtil;
import com.striptrips.utils.ResourcesUtil;

import java.util.List;

public class PackageListAdapter extends BaseAdapter {

    private final List<Package> packages;
    private final Context context;

    public PackageListAdapter(List<Package> packages,
                              Context context){
        this.packages = packages;
        this.context = context;
    }

    @Override
    public int getCount() {
        return packages.size();
    }

    @Override
    public Package getItem(int position) {
        return packages.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View renderedView = LayoutInflater.from(context)
                .inflate(R.layout.package_item, parent, false);
        Package tripPackage = packages.get(position);
        displayLocation(renderedView, tripPackage);
        displayImage(renderedView, tripPackage);
        displayAmountOfDays(renderedView, tripPackage);
        displayPrice(renderedView, tripPackage);
        return renderedView;
    }

    private void displayPrice(View renderedView, Package tripPackage) {
        TextView price = renderedView.findViewById(R.id.item_package_price);
        String brazillianCurrency = CurrencyFormatterUtil
                .formatCurrencyToBrl(tripPackage.getPrice());
        price.setText(brazillianCurrency);
    }

    private void displayAmountOfDays(View renderedView, Package tripPackage) {
        TextView amountOfDays = renderedView.findViewById(R.id.item_package_days);
        String amountOfDaysText = DaysFormatterUtil.formatToText(tripPackage.getAmountOfDays());
        amountOfDays.setText(amountOfDaysText);
    }



    private void displayImage(View renderedView, Package tripPackage) {
        ImageView image = renderedView.findViewById(R.id.item_package_image);
        Drawable packageImage = ResourcesUtil.getDrawable(context, tripPackage.getImage());
        image.setImageDrawable(packageImage);
    }

    private void displayLocation(View renderedView, Package tripPackage) {
        TextView location = renderedView.findViewById(R.id.item_package_location);
        location.setText(tripPackage.getLocation());
    }
}
