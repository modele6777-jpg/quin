package defpackage;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.message.model.InAppMessage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rz6 extends gbe implements l26 {
    Object L$0;
    int label;
    final /* synthetic */ uz6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz6(uz6 uz6Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = uz6Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new rz6(this.this$0, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007e  */
    /* JADX WARN: Code duplicated, block: B:31:0x008f  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a0 A[EDGE_INSN: B:38:0x00a0->B:34:0x00a0 BREAK  A[LOOP:0: B:28:0x0088->B:39:?, LOOP_LABEL: LOOP:0: B:28:0x0088->B:39:?], SYNTHETIC] */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        List list;
        Iterator it;
        OffsetDateTime createdAt;
        int i = this.label;
        OffsetDateTime offsetDateTime = null;
        bw2 bw2Var = bw2.a;
        if (i == 0) {
            jzb.q(obj);
            zt8 zt8Var = this.this$0.a;
            this.label = 1;
            obj = zt8.a(zt8Var, this);
            if (obj != bw2Var) {
            }
            return bw2Var;
        }
        if (i == 1) {
            jzb.q(obj);
        } else {
            if (i != 2) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = (List) this.L$0;
            jzb.q(obj);
        }
        it = list.iterator();
        if (it.hasNext()) {
            createdAt = ((InAppMessage) it.next()).getCreatedAt();
            loop0: while (true) {
                offsetDateTime = createdAt;
                do {
                    if (it.hasNext()) {
                        break loop0;
                    }
                    createdAt = ((InAppMessage) it.next()).getCreatedAt();
                } while (offsetDateTime.compareTo(createdAt) >= 0);
            }
        }
        if (offsetDateTime == null) {
            return OffsetDateTime.MIN;
        }
        return offsetDateTime;
        List list2 = (List) obj;
        bz6 bz6Var = this.this$0.b;
        ArrayList arrayList = new ArrayList(t72.u(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(jgb.i0((InAppMessage) it2.next()));
        }
        this.L$0 = list2;
        this.label = 2;
        Object objK = urg.K(this, new so5(13, bz6Var, arrayList), bz6Var.a, false, true);
        if (objK != bw2Var) {
            objK = wef.a;
        }
        if (objK != bw2Var) {
            list = list2;
            it = list.iterator();
            if (it.hasNext()) {
                createdAt = ((InAppMessage) it.next()).getCreatedAt();
                loop0: while (true) {
                    offsetDateTime = createdAt;
                    do {
                        if (it.hasNext()) {
                            break loop0;
                            break loop0;
                        }
                        createdAt = ((InAppMessage) it.next()).getCreatedAt();
                    } while (offsetDateTime.compareTo(createdAt) >= 0);
                }
            }
            if (offsetDateTime == null) {
                return OffsetDateTime.MIN;
            }
            return offsetDateTime;
        }
        return bw2Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((rz6) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
