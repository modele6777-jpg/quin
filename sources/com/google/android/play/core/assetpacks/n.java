package com.google.android.play.core.assetpacks;

import defpackage.bfg;
import defpackage.egg;
import defpackage.ggg;
import defpackage.ib8;
import defpackage.lhg;
import defpackage.sgg;
import defpackage.ub3;
import defpackage.v36;
import defpackage.vgg;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class n {
    public final b a;
    public final k b;
    public final egg c;
    public final vgg d;
    public final bfg e;
    public final bfg f;

    public n(b bVar, bfg bfgVar, k kVar, bfg bfgVar2, egg eggVar, vgg vggVar) {
        this.a = bVar;
        this.e = bfgVar;
        this.b = kVar;
        this.f = bfgVar2;
        this.c = eggVar;
        this.d = vggVar;
    }

    public final void a(sgg sggVar) {
        String str = (String) sggVar.b;
        int i = sggVar.a;
        int i2 = sggVar.c;
        long j = sggVar.d;
        b bVar = this.a;
        bVar.getClass();
        File file = new File(bVar.c(i2, j, str), "_packs");
        File file2 = new File(new File(bVar.c(i2, j, str), "_slices"), "_metadata");
        if (!file.exists() || !file2.exists()) {
            throw new g(ib8.j("Cannot find pack files to move for pack ", str, "."), i);
        }
        File fileH = bVar.h(i2, j, str);
        fileH.mkdirs();
        if (!file.renameTo(fileH)) {
            throw new g("Cannot move merged pack files to final location.", i);
        }
        new File(bVar.h(i2, j, str), "merge.tmp").delete();
        File file3 = new File(bVar.h(i2, j, str), "_metadata");
        file3.mkdirs();
        if (!file2.renameTo(file3)) {
            throw new g("Cannot move metadata files to final location.", i);
        }
        try {
            this.d.b(sggVar.c, sggVar.d, (String) sggVar.b, sggVar.e);
            ((Executor) this.f.a()).execute(new v36(22, this, sggVar));
            k kVar = this.b;
            kVar.getClass();
            kVar.b(new ggg(kVar, str, i2, j));
            this.c.a(str);
            ((lhg) this.e.a()).c(i, str);
        } catch (IOException e) {
            throw new g(ub3.k("Could not write asset pack version tag for pack ", str, ": ", e.getMessage()), i);
        }
    }
}
