package defpackage;

import ai.askquin.R;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.provider.MediaStore;
import com.canhub.cropper.CropImageActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class iz2 {
    public final CropImageActivity a;
    public final vd9 b;
    public String c;
    public List d;
    public Uri e;
    public final jf f;

    public iz2(CropImageActivity cropImageActivity, vd9 vd9Var) {
        this.a = cropImageActivity;
        this.b = vd9Var;
        String string = cropImageActivity.getString(R.string.pick_image_chooser_title);
        string.getClass();
        this.c = string;
        this.d = t72.I("com.google.android.apps.photos", "com.google.android.apps.photosgo", "com.sec.android.gallery3d", "com.oneplus.gallery", "com.miui.gallery");
        this.f = cropImageActivity.p(new jv2(21, this), new af(4));
    }

    public final ArrayList a(PackageManager packageManager, String str) {
        Object next;
        ArrayList arrayList = new ArrayList();
        Intent intent = str.equals("android.intent.action.GET_CONTENT") ? new Intent(str) : new Intent(str, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        intent.setType("image/*");
        List<ResolveInfo> listQueryIntentActivities = Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0L)) : packageManager.queryIntentActivities(intent, 0);
        listQueryIntentActivities.getClass();
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            Intent intent2 = new Intent(intent);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            arrayList.add(intent2);
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : this.d) {
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!pa7.t(((Intent) next).getPackage(), str2));
            Intent intent3 = (Intent) next;
            if (intent3 != null) {
                arrayList.remove(intent3);
                arrayList2.add(intent3);
            }
        }
        arrayList.addAll(0, arrayList2);
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0075  */
    /* JADX WARN: Code duplicated, block: B:31:0x0086 A[LOOP:1: B:29:0x0080->B:31:0x0086, LOOP_END] */
    public final void b(boolean z, boolean z2, Uri uri) {
        ArrayList arrayList;
        Intent intent;
        List<ResolveInfo> listQueryIntentActivities;
        Intent intent2;
        this.e = uri;
        ArrayList arrayList2 = new ArrayList();
        CropImageActivity cropImageActivity = this.a;
        PackageManager packageManager = cropImageActivity.getPackageManager();
        String packageName = cropImageActivity.getPackageName();
        try {
            String[] strArr = (Build.VERSION.SDK_INT >= 33 ? cropImageActivity.getPackageManager().getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(4096L)) : cropImageActivity.getPackageManager().getPackageInfo(packageName, 4096)).requestedPermissions;
            if (strArr != null) {
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        String str = strArr[i];
                        if (str == null || !str.equalsIgnoreCase("android.permission.CAMERA")) {
                            i++;
                        } else if (cropImageActivity.checkSelfPermission("android.permission.CAMERA") == 0) {
                        }
                    }
                    if (z) {
                        packageManager.getClass();
                        arrayList = new ArrayList();
                        intent = new Intent("android.media.action.IMAGE_CAPTURE");
                        if (Build.VERSION.SDK_INT >= 33) {
                            listQueryIntentActivities = packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0L));
                        } else {
                            listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
                        }
                        listQueryIntentActivities.getClass();
                        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                            Intent intent3 = new Intent(intent);
                            ActivityInfo activityInfo = resolveInfo.activityInfo;
                            intent3.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                            intent3.setPackage(resolveInfo.activityInfo.packageName);
                            cropImageActivity.grantUriPermission(resolveInfo.activityInfo.packageName, this.e, 3);
                            intent3.putExtra("output", this.e);
                            arrayList.add(intent3);
                        }
                        arrayList2.addAll(arrayList);
                    }
                }
            } else if (z) {
                packageManager.getClass();
                arrayList = new ArrayList();
                intent = new Intent("android.media.action.IMAGE_CAPTURE");
                if (Build.VERSION.SDK_INT >= 33) {
                    listQueryIntentActivities = packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0L));
                } else {
                    listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
                }
                listQueryIntentActivities.getClass();
                while (r3.hasNext()) {
                    Intent intent4 = new Intent(intent);
                    ActivityInfo activityInfo2 = resolveInfo.activityInfo;
                    intent4.setComponent(new ComponentName(activityInfo2.packageName, activityInfo2.name));
                    intent4.setPackage(resolveInfo.activityInfo.packageName);
                    cropImageActivity.grantUriPermission(resolveInfo.activityInfo.packageName, this.e, 3);
                    intent4.putExtra("output", this.e);
                    arrayList.add(intent4);
                }
                arrayList2.addAll(arrayList);
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        if (z2) {
            packageManager.getClass();
            ArrayList arrayListA = a(packageManager, "android.intent.action.GET_CONTENT");
            if (arrayListA.isEmpty()) {
                arrayListA = a(packageManager, "android.intent.action.PICK");
            }
            arrayList2.addAll(arrayListA);
        }
        if (arrayList2.isEmpty()) {
            intent2 = new Intent();
        } else {
            Intent intent5 = new Intent("android.intent.action.CHOOSER", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            if (z2) {
                intent5.setAction("android.intent.action.PICK");
                intent5.setType("image/*");
            }
            intent2 = intent5;
        }
        Intent intentCreateChooser = Intent.createChooser(intent2, this.c);
        intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
        this.f.y(intentCreateChooser, null);
    }
}
