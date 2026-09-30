package com.google.android.play.core.assetpacks;

import defpackage.bfg;
import defpackage.egg;
import defpackage.ggg;
import defpackage.ib8;
import defpackage.lhg;
import defpackage.ub3;
import defpackage.w36;
import defpackage.zgg;
import java.io.File;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class p {
    public final b a;
    public final k b;
    public final egg c;
    public final bfg d;
    public final bfg e;

    public p(b bVar, bfg bfgVar, k kVar, bfg bfgVar2, egg eggVar) {
        this.a = bVar;
        this.d = bfgVar;
        this.b = kVar;
        this.e = bfgVar2;
        this.c = eggVar;
    }

    public final void a(zgg zggVar) {
        String str = (String) zggVar.b;
        int i = zggVar.d;
        int i2 = zggVar.a;
        int i3 = zggVar.c;
        long j = zggVar.e;
        b bVar = this.a;
        File fileH = bVar.h(i3, j, str);
        if (!fileH.exists()) {
            throw new g(ub3.k("Cannot find pack files to promote for pack ", str, " at ", fileH.getAbsolutePath()), i2);
        }
        File fileH2 = bVar.h(i, j, str);
        fileH2.mkdirs();
        if (!fileH.renameTo(fileH2)) {
            String absolutePath = fileH.getAbsolutePath();
            String absolutePath2 = fileH2.getAbsolutePath();
            StringBuilder sbO = ib8.o("Cannot promote pack ", str, " from ", absolutePath, " to ");
            sbO.append(absolutePath2);
            throw new g(sbO.toString(), i2);
        }
        ((Executor) this.e.a()).execute(new w36(18, this, zggVar));
        k kVar = this.b;
        kVar.getClass();
        kVar.b(new ggg(kVar, str, i, j));
        this.c.a(str);
        ((lhg) this.d.a()).c(i2, str);
    }
}
