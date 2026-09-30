package com.google.android.play.core.assetpacks;

import android.os.ParcelFileDescriptor;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.bfg;
import defpackage.dgg;
import defpackage.iec;
import defpackage.lhg;
import defpackage.rch;
import defpackage.tec;
import defpackage.ygg;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class o {
    public static final rch c = new rch("PatchSliceTaskHandler");
    public final b a;
    public final bfg b;

    public o(b bVar, bfg bfgVar) {
        this.a = bVar;
        this.b = bfgVar;
    }

    public final void a(ygg yggVar) {
        rch rchVar = c;
        String str = (String) yggVar.b;
        int i = yggVar.a;
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = yggVar.x;
        int i2 = yggVar.c;
        long j = yggVar.d;
        b bVar = this.a;
        File fileH = bVar.h(i2, j, str);
        File file = new File(bVar.h(i2, j, str), "_metadata");
        String str2 = yggVar.v;
        File file2 = new File(file, str2);
        try {
            InputStream gZIPInputStream = yggVar.g != 2 ? autoCloseInputStream : new GZIPInputStream(autoCloseInputStream, UserMetadata.MAX_INTERNAL_KEY_SIZE);
            try {
                c cVar = new c(fileH, file2);
                File fileI = this.a.i(yggVar.e, yggVar.f, (String) yggVar.b, yggVar.v);
                if (!fileI.exists()) {
                    fileI.mkdirs();
                }
                q qVar = new q(this.a, (String) yggVar.b, yggVar.e, yggVar.f, yggVar.v);
                iec.e(cVar, gZIPInputStream, new dgg(fileI, qVar), yggVar.w);
                qVar.h(0);
                gZIPInputStream.close();
                rchVar.e("Patching and extraction finished for slice %s of pack %s.", str2, str);
                ((lhg) this.b.a()).e(str, i, str2, 0);
                try {
                    autoCloseInputStream.close();
                } catch (IOException unused) {
                    rchVar.f("Could not close file for slice %s of pack %s.", str2, str);
                }
            } catch (Throwable th) {
                try {
                    gZIPInputStream.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (IOException e) {
            rchVar.b("IOException during patching %s.", e.getMessage());
            throw new g(tec.m("Error patching slice ", str2, " of pack ", str, "."), e, i);
        }
    }
}
