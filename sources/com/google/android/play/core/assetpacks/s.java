package com.google.android.play.core.assetpacks;

import defpackage.aic;
import defpackage.bhg;
import defpackage.ib8;
import defpackage.rch;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class s {
    public static final rch b = new rch("VerifySliceTaskHandler");
    public final b a;

    public s(b bVar) {
        this.a = bVar;
    }

    public final void a(bhg bhgVar) {
        String str = (String) bhgVar.b;
        String str2 = (String) bhgVar.b;
        String str3 = bhgVar.e;
        int i = bhgVar.a;
        File fileI = this.a.i(bhgVar.c, bhgVar.d, str2, str3);
        if (!fileI.exists()) {
            throw new g(ib8.j("Cannot find unverified files for slice ", str3, "."), i);
        }
        try {
            b bVar = this.a;
            String str4 = bhgVar.e;
            int i2 = bhgVar.c;
            long j = bhgVar.d;
            bVar.getClass();
            File file = new File(new File(new File(bVar.c(i2, j, str), "_slices"), "_metadata"), str4);
            if (!file.exists()) {
                throw new g("Cannot find metadata files for slice " + str4 + ".", i);
            }
            try {
                if (!aic.e(r.a(fileI, file)).equals(bhgVar.f)) {
                    throw new g(ib8.j("Verification failed for slice ", str4, "."), i);
                }
                b.e("Verification of slice %s of pack %s successful.", str4, str);
                File fileJ = this.a.j(bhgVar.c, bhgVar.d, (String) bhgVar.b, bhgVar.e);
                if (!fileJ.exists()) {
                    fileJ.mkdirs();
                }
                if (!fileI.renameTo(fileJ)) {
                    throw new g(ib8.j("Failed to move slice ", str3, " after verification."), i);
                }
            } catch (IOException e) {
                throw new g(ib8.j("Could not digest file during verification for slice ", str3, "."), e, i);
            } catch (NoSuchAlgorithmException e2) {
                throw new g("SHA256 algorithm not supported.", e2, i);
            }
        } catch (IOException e3) {
            throw new g(ib8.j("Could not reconstruct slice archive during verification for slice ", str3, "."), e3, i);
        }
    }
}
