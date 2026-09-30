package defpackage;

import android.hardware.camera2.params.SessionConfiguration;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vh implements jf1 {
    public final ArrayList a;

    public vh(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.jf1
    public final ff8 a(SessionConfiguration sessionConfiguration) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ff8 ff8VarA = ((jf1) it.next()).a(sessionConfiguration);
            if (ff8VarA.b != 0) {
                return ff8VarA;
            }
        }
        return new ff8(0, 4);
    }
}
