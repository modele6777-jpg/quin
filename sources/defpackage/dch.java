package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class dch {
    public Object a;
    public qeh b;
    public ueh c;
    public boolean d;

    public final void a(Object obj) {
        this.d = true;
        qeh qehVar = this.b;
        if (qehVar != null) {
            beh behVar = qehVar.b;
            behVar.getClass();
            if (obj == null) {
                obj = bbh.g;
            }
            if (bbh.f.x(behVar, null, obj)) {
                bbh.d(behVar);
                this.a = null;
                this.b = null;
                this.c = null;
            }
        }
    }

    public final void finalize() {
        ueh uehVar;
        qeh qehVar = this.b;
        if (qehVar != null) {
            beh behVar = qehVar.b;
            if (!behVar.isDone()) {
                if (bbh.f.x(behVar, null, new ezg(new vch("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.a)))))) {
                    bbh.d(behVar);
                }
            }
        }
        if (this.d || (uehVar = this.c) == null) {
            return;
        }
        uehVar.i(null);
    }
}
