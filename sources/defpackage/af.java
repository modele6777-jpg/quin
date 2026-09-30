package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class af extends mh3 {
    public final /* synthetic */ int O;

    public /* synthetic */ af(int i) {
        this.O = i;
    }

    @Override // defpackage.mh3
    public ze I(Context context, Object obj) {
        switch (this.O) {
            case 0:
                ((String) obj).getClass();
                return null;
            case 1:
                ((qda) obj).getClass();
                return null;
            case 2:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                if (strArr.length == 0) {
                    return new ze(qu4.a);
                }
                for (String str : strArr) {
                    if (bp.c(context, str) != 0) {
                        return null;
                    }
                }
                int iF = bm8.F(strArr.length);
                if (iF < 16) {
                    iF = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iF);
                for (String str2 : strArr) {
                    iy9 iy9Var = new iy9(str2, Boolean.TRUE);
                    linkedHashMap.put(iy9Var.d(), iy9Var.e());
                }
                return new ze(linkedHashMap);
            case 3:
                String str3 = (String) obj;
                str3.getClass();
                if (bp.c(context, str3) == 0) {
                    return new ze(Boolean.TRUE);
                }
                return null;
            case 4:
            case 5:
            default:
                return super.I(context, obj);
            case 6:
                ((Uri) obj).getClass();
                return null;
        }
    }

    @Override // defpackage.mh3
    public final Object R(Intent intent, int i) {
        List arrayList;
        z = false;
        boolean z = false;
        switch (this.O) {
            case 0:
                if (i != -1) {
                    intent = null;
                }
                if (intent != null) {
                    return intent.getData();
                }
                return null;
            case 1:
                if (i != -1) {
                    intent = null;
                }
                if (intent == null) {
                    return null;
                }
                Uri data = intent.getData();
                if (data != null) {
                    return data;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data2 = intent.getData();
                if (data2 != null) {
                    linkedHashSet.add(data2);
                }
                ClipData clipData = intent.getClipData();
                if (clipData == null && linkedHashSet.isEmpty()) {
                    arrayList = pu4.a;
                } else {
                    if (clipData != null) {
                        int itemCount = clipData.getItemCount();
                        for (int i2 = 0; i2 < itemCount; i2++) {
                            Uri uri = clipData.getItemAt(i2).getUri();
                            if (uri != null) {
                                linkedHashSet.add(uri);
                            }
                        }
                    }
                    arrayList = new ArrayList(linkedHashSet);
                }
                return (Uri) s72.x0(arrayList);
            case 2:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList2 = new ArrayList(intArrayExtra.length);
                        for (int i3 : intArrayExtra) {
                            arrayList2.add(Boolean.valueOf(i3 == 0));
                        }
                        return bm8.W(s72.r1(qd0.k0(stringArrayExtra), arrayList2));
                    }
                }
                return qu4.a;
            case 3:
                if (intent == null || i != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra2 != null) {
                    for (int i4 : intArrayExtra2) {
                        if (i4 == 0) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 4:
                return new xe(intent, i);
            case 5:
                return new xe(intent, i);
            case 6:
                return Boolean.valueOf(i == -1);
            default:
                return new xe(intent, i);
        }
    }

    @Override // defpackage.mh3
    public final Intent u(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.O) {
            case 0:
                String str = (String) obj;
                str.getClass();
                Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str);
                type.getClass();
                return type;
            case 1:
                qda qdaVar = (qda) obj;
                qdaVar.getClass();
                if (p6.j()) {
                    Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                    intent.setType(p6.h(qdaVar.a));
                    intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", 1);
                    return intent;
                }
                if (context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112) == null) {
                    Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
                    intent2.setType(p6.h(qdaVar.a));
                    if (intent2.getType() != null) {
                        return intent2;
                    }
                    intent2.setType("*/*");
                    intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                    return intent2;
                }
                ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
                if (resolveInfoResolveActivity == null) {
                    qc0.p("Required value was null.");
                    return null;
                }
                ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
                Intent intent3 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
                intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent3.setType(p6.h(qdaVar.a));
                intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", 1);
                return intent3;
            case 2:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                intentPutExtra.getClass();
                return intentPutExtra;
            case 3:
                String str2 = (String) obj;
                str2.getClass();
                Intent intentPutExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str2});
                intentPutExtra2.getClass();
                return intentPutExtra2;
            case 4:
                Intent intent4 = (Intent) obj;
                intent4.getClass();
                return intent4;
            case 5:
                j77 j77Var = (j77) obj;
                j77Var.getClass();
                Intent intentPutExtra3 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", j77Var);
                intentPutExtra3.getClass();
                return intentPutExtra3;
            case 6:
                Uri uri = (Uri) obj;
                uri.getClass();
                Intent intentAddFlags = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", uri).addFlags(1).addFlags(2);
                intentAddFlags.getClass();
                return intentAddFlags;
            default:
                j77 j77Var2 = (j77) obj;
                Intent intent5 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent6 = j77Var2.b;
                if (intent6 != null && (bundleExtra = intent6.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent5.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent6.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent6.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        j77Var2 = new j77(j77Var2.a, null, j77Var2.c, j77Var2.d);
                    }
                }
                intent5.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", j77Var2);
                if (zx5.I(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent5);
                }
                return intent5;
        }
    }
}
