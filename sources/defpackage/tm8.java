package defpackage;

import java.util.Iterator;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class tm8 extends d1 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ tm8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.d1
    public final int c() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((um8) obj).a.groupCount() + 1;
            default:
                return ((w8a) obj).b;
        }
    }

    @Override // defpackage.d1, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                if (obj == null ? true : obj instanceof rm8) {
                    return super.contains((rm8) obj);
                }
                return false;
            default:
                return ((w8a) this.b).containsValue(obj);
        }
    }

    public rm8 d(int i) {
        Matcher matcher = ((um8) this.b).a;
        z67 z67VarC0 = mh3.c0(matcher.start(i), matcher.end(i));
        if (z67VarC0.a < 0) {
            return null;
        }
        String strGroup = matcher.group(i);
        strGroup.getClass();
        return new rm8(strGroup, z67VarC0);
    }

    @Override // defpackage.d1, java.util.Collection
    public boolean isEmpty() {
        switch (this.a) {
            case 0:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new b3f(fyc.x(new td0(1, t72.B(this)), new za6(26, this)));
            default:
                p4f p4fVar = ((w8a) this.b).a;
                q4f[] q4fVarArr = new q4f[8];
                for (int i = 0; i < 8; i++) {
                    q4fVarArr[i] = new s4f(2);
                }
                return new m9a(p4fVar, q4fVarArr);
        }
    }
}
