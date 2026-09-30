package defpackage;

import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g9c extends fac implements dac {
    public ArrayList h = new ArrayList();
    public Boolean i;
    public Matrix j;
    public int k;
    public String l;

    @Override // defpackage.dac
    public final List a() {
        return this.h;
    }

    @Override // defpackage.dac
    public final void f(hac hacVar) throws ibc {
        if (hacVar instanceof y9c) {
            this.h.add(hacVar);
            return;
        }
        throw new ibc("Gradient elements cannot contain " + hacVar + " elements.");
    }
}
