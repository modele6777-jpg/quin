package defpackage;

import android.graphics.Canvas;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class cbc extends fbc {
    public float a;
    public float b;
    public final /* synthetic */ hbc c;

    public cbc(hbc hbcVar, float f, float f2) {
        this.c = hbcVar;
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.fbc
    public void j(String str) {
        hbc hbcVar = this.c;
        Canvas canvas = (Canvas) hbcVar.a;
        if (hbcVar.T0()) {
            ebc ebcVar = (ebc) hbcVar.c;
            if (ebcVar.b) {
                canvas.drawText(str, this.a, this.b, ebcVar.d);
            }
            ebc ebcVar2 = (ebc) hbcVar.c;
            if (ebcVar2.c) {
                canvas.drawText(str, this.a, this.b, ebcVar2.e);
            }
        }
        this.a = ((ebc) hbcVar.c).d.measureText(str) + this.a;
    }
}
