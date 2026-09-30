package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import tech.chatmind.api.WhereDidYouHear;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bj6 extends h36 implements a26 {
    public static final bj6 a = new bj6(1, dj6.class, "trackHearFromSubmission", "trackHearFromSubmission(Ljava/util/Set;)V", 1);

    @Override // defpackage.a26
    public final Object d(Object obj) {
        Set set = (Set) obj;
        set.getClass();
        Set set2 = set;
        ArrayList arrayList = new ArrayList(t72.u(set2, 10));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(ppf.a((WhereDidYouHear) it.next()));
        }
        aj6 aj6Var = new aj6(arrayList);
        x1f x1fVar = x1f.a;
        x1f.k(p05.a, new za6(6, aj6Var), 2);
        return wef.a;
    }
}
