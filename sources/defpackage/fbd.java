package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fbd implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b6d b;

    public /* synthetic */ fbd(b6d b6dVar, int i) {
        this.a = i;
        this.b = b6dVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        b6d b6dVar = this.b;
        l1f l1fVar = (l1f) obj;
        switch (i) {
            case 0:
                l1fVar.getClass();
                for (Map.Entry entry : b6dVar.b.entrySet()) {
                    l1fVar.a(entry.getValue(), (String) entry.getKey());
                }
                break;
            default:
                l1fVar.getClass();
                for (Map.Entry entry2 : b6dVar.b.entrySet()) {
                    l1fVar.a(entry2.getValue(), (String) entry2.getKey());
                }
                break;
        }
        return wefVar;
    }
}
