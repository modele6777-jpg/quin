package defpackage;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class es7 extends cgg {
    public es7(Metadata metadata) {
        String[] strArrD1 = metadata.d1();
        strArrD1 = strArrD1.length == 0 ? null : strArrD1;
        if (strArrD1 != null) {
            iy9 iy9VarG = sl7.g(strArrD1, metadata.d2());
            wk7 wk7Var = (wk7) iy9VarG.a();
            dza dzaVar = (dza) iy9VarG.b();
            boolean z = new uk7(metadata.mv()).compareTo(new uk7(1, 4, 0)) < 0;
            dzaVar.getClass();
            wk7Var.getClass();
            b0b b0bVarN0 = dzaVar.n0();
            b0bVarN0.getClass();
            db6.S0(dzaVar, new o74(wk7Var, new bu3(b0bVarN0), otf.b, z, (List) null, 48));
        }
        new uk7(metadata.mv());
        metadata.xi();
    }
}
