package defpackage;

import androidx.compose.material.ripple.RippleNode;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vu extends RippleNode {
    public b5c M0;
    public c5c N0;

    @Override // defpackage.i09
    public final void e1() {
        b5c b5cVar = this.M0;
        if (b5cVar != null) {
            this.N0 = null;
            qn4.G(this);
            vea veaVar = b5cVar.d;
            c5c c5cVar = (c5c) ((LinkedHashMap) veaVar.b).get(this);
            if (c5cVar != null) {
                c5cVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) veaVar.b;
                c5c c5cVar2 = (c5c) linkedHashMap.get(this);
                if (c5cVar2 != null) {
                }
                linkedHashMap.remove(this);
                b5cVar.c.add(c5cVar);
            }
        }
    }
}
