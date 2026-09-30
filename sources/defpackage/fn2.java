package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.io.FileNotFoundException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fn2 implements pc5 {
    public final qhf a;
    public final as9 b;

    public fn2(qhf qhfVar, as9 as9Var) {
        this.a = qhfVar;
        this.b = as9Var;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a2  */
    @Override // defpackage.pc5
    public final Object a(pv4 pv4Var) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        List listF;
        int size;
        Bundle bundle;
        qhf qhfVar = this.a;
        Uri uri = Uri.parse(qhfVar.a);
        as9 as9Var = this.b;
        ContentResolver contentResolver = as9Var.a.getContentResolver();
        String str = qhfVar.d;
        if (pa7.t(str, "com.android.contacts") && pa7.t(s72.H0(afc.f(qhfVar)), "display_photo")) {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                r82.e(uri, "'.", "Unable to find a contact photo associated with '");
                return null;
            }
        } else if (Build.VERSION.SDK_INT >= 29 && pa7.t(str, "media") && (size = (listF = afc.f(qhfVar)).size()) >= 3 && pa7.t(listF.get(size - 3), "audio") && pa7.t(listF.get(size - 2), "albums")) {
            ykd ykdVar = as9Var.b;
            b94 b94Var = ykdVar.a;
            z84 z84Var = b94Var instanceof z84 ? (z84) b94Var : null;
            if (z84Var != null) {
                int i = z84Var.a;
                b94 b94Var2 = ykdVar.b;
                z84 z84Var2 = b94Var2 instanceof z84 ? (z84) b94Var2 : null;
                if (z84Var2 != null) {
                    int i2 = z84Var2.a;
                    bundle = new Bundle(1);
                    bundle.putParcelable("android.content.extra.SIZE", new Point(i, i2));
                } else {
                    bundle = null;
                }
            } else {
                bundle = null;
            }
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                r82.e(uri, "'.", "Unable to find a music thumbnail associated with '");
                return null;
            }
        } else {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                r82.e(uri, "'.", "Unable to open '");
                return null;
            }
        }
        return new otd(new ptd(new yhb(z5c.K(assetFileDescriptorOpenAssetFileDescriptor.createInputStream())), as9Var.f, new vm2(assetFileDescriptorOpenAssetFileDescriptor)), contentResolver.getType(uri), zb3.c);
    }
}
