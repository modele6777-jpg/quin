package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.bu7;
import defpackage.du3;
import defpackage.ff5;
import defpackage.hj6;
import defpackage.ij6;
import defpackage.jp0;
import defpackage.kb2;
import defpackage.kj6;
import defpackage.lb2;
import defpackage.ns0;
import defpackage.oo3;
import defpackage.pd4;
import defpackage.xq3;
import defpackage.xw3;
import defpackage.y3b;
import defpackage.z7f;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    private static final String ANDROID_INSTALLER = "android-installer";
    private static final String ANDROID_PLATFORM = "android-platform";
    private static final String DEVICE_BRAND = "device-brand";
    private static final String DEVICE_MODEL = "device-model";
    private static final String DEVICE_NAME = "device-name";
    private static final String FIREBASE_ANDROID = "fire-android";
    private static final String FIREBASE_COMMON = "fire-core";
    private static final String KOTLIN = "kotlin";
    private static final String MIN_SDK = "android-min-sdk";
    private static final String TARGET_SDK = "android-target-sdk";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getComponents$0(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getComponents$1(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getComponents$2(Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return "auto";
        }
        return context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "embedded" : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getComponents$3(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? safeValue(installerPackageName) : "";
    }

    private static String safeValue(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<lb2> getComponents() {
        String string;
        ArrayList arrayList = new ArrayList();
        kb2 kb2VarB = lb2.b(du3.class);
        kb2VarB.a(new xw3(2, 0, jp0.class));
        int i = 22;
        kb2VarB.f = new oo3(i);
        arrayList.add(kb2VarB.b());
        y3b y3bVar = new y3b(ns0.class, Executor.class);
        kb2 kb2Var = new kb2(zq3.class, ij6.class, kj6.class);
        kb2Var.a(xw3.c(Context.class));
        kb2Var.a(xw3.c(ff5.class));
        kb2Var.a(new xw3(2, 0, hj6.class));
        kb2Var.a(new xw3(1, 1, du3.class));
        kb2Var.a(new xw3(y3bVar, 1, 0));
        kb2Var.f = new xq3(y3bVar, 0);
        arrayList.add(kb2Var.b());
        arrayList.add(z7f.B(FIREBASE_ANDROID, String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(z7f.B(FIREBASE_COMMON, "22.2.0"));
        arrayList.add(z7f.B(DEVICE_NAME, safeValue(Build.PRODUCT)));
        arrayList.add(z7f.B(DEVICE_MODEL, safeValue(Build.DEVICE)));
        arrayList.add(z7f.B(DEVICE_BRAND, safeValue(Build.BRAND)));
        arrayList.add(z7f.E(TARGET_SDK, new pd4(19)));
        arrayList.add(z7f.E(MIN_SDK, new pd4(20)));
        arrayList.add(z7f.E(ANDROID_PLATFORM, new pd4(21)));
        arrayList.add(z7f.E(ANDROID_INSTALLER, new pd4(i)));
        try {
            string = bu7.e.toString();
        } catch (NoClassDefFoundError unused) {
            string = null;
        }
        if (string != null) {
            arrayList.add(z7f.B(KOTLIN, string));
        }
        return arrayList;
    }
}
