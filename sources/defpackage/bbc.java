package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class bbc extends cbc {
    public final Path d;
    public final /* synthetic */ hbc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbc(hbc hbcVar, Path path, float f) {
        super(hbcVar, f, 0.0f);
        this.e = hbcVar;
        this.d = path;
    }

    @Override // defpackage.cbc, defpackage.fbc
    public final void j(String str) {
        hbc hbcVar = this.e;
        if (hbcVar.T0()) {
            ebc ebcVar = (ebc) hbcVar.c;
            if (ebcVar.b) {
                ((Canvas) hbcVar.a).drawTextOnPath(str, this.d, this.a, this.b, ebcVar.d);
            }
            ebc ebcVar2 = (ebc) hbcVar.c;
            if (ebcVar2.c) {
                ((Canvas) hbcVar.a).drawTextOnPath(str, this.d, this.a, this.b, ebcVar2.e);
            }
        }
        this.a = ((ebc) hbcVar.c).d.measureText(str) + this.a;
    }
}
