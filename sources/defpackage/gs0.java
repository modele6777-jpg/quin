package defpackage;

import java.lang.ref.WeakReference;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gs0 extends ewf {
    public final String b;
    public g5b c;

    public gs0(ycc yccVar) {
        String string = (String) yccVar.a("SaveableStateHolder_BackStackEntryKey");
        if (string == null) {
            string = UUID.randomUUID().toString();
            yccVar.d("SaveableStateHolder_BackStackEntryKey", string);
        }
        this.b = string;
    }

    @Override // defpackage.ewf
    public final void e() {
        g5b g5bVar = this.c;
        if (g5bVar == null) {
            pa7.g0("saveableStateHolderRef");
            throw null;
        }
        qcc qccVar = (qcc) ((WeakReference) g5bVar.b).get();
        if (qccVar != null) {
            qccVar.f(this.b);
        }
        g5b g5bVar2 = this.c;
        if (g5bVar2 != null) {
            ((WeakReference) g5bVar2.b).clear();
        } else {
            pa7.g0("saveableStateHolderRef");
            throw null;
        }
    }
}
