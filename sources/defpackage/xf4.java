package defpackage;

import ai.askquin.ui.conversation.r0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xf4 extends gbe implements l26 {
    final /* synthetic */ cfb $entrypoint;
    final /* synthetic */ List<String> $tags;
    final /* synthetic */ String $text;
    final /* synthetic */ sfb $type;
    boolean Z$0;
    int label;
    final /* synthetic */ r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf4(r0 r0Var, sfb sfbVar, cfb cfbVar, List list, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = r0Var;
        this.$type = sfbVar;
        this.$entrypoint = cfbVar;
        this.$tags = list;
        this.$text = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new xf4(this.this$0, this.$type, this.$entrypoint, this.$tags, this.$text, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007b, code lost:
    
        if (defpackage.lw2.b(r0, r14) == r5) goto L19;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.label
            r1 = 0
            r2 = 2
            r3 = 1
            r4 = 0
            bw2 r5 = defpackage.bw2.a
            if (r0 == 0) goto L1c
            if (r0 == r3) goto L18
            if (r0 != r2) goto L12
            defpackage.jzb.q(r15)
            goto L7e
        L12:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r14)
            return r1
        L18:
            defpackage.jzb.q(r15)
            goto L59
        L1c:
            defpackage.jzb.q(r15)
            x1f r15 = defpackage.x1f.a
            ai.askquin.ui.conversation.r0 r15 = r14.this$0
            dl r0 = new dl
            r6 = 5
            r0.<init>(r15, r6)
            p05 r15 = defpackage.p05.a
            defpackage.x1f.k(r15, r0, r2)
            ai.askquin.ui.conversation.r0 r15 = r14.this$0
            zb5 r0 = r15.c
            fc4 r15 = r15.H0
            if (r15 == 0) goto Lb0
            java.lang.String r7 = r15.a
            sfb r8 = r14.$type
            cfb r9 = r14.$entrypoint
            java.util.List<java.lang.String> r10 = r14.$tags
            java.lang.String r11 = r14.$text
            r14.label = r3
            r12 = r0
            ec5 r12 = (defpackage.ec5) r12
            r12.getClass()
            js3 r15 = defpackage.ga4.a
            hr3 r15 = defpackage.hr3.c
            dc5 r6 = new dc5
            r13 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r15 = defpackage.ynb.p0(r15, r6, r14)
            if (r15 != r5) goto L59
            goto L7d
        L59:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            ai.askquin.ui.conversation.r0 r0 = r14.this$0
            if (r15 == 0) goto L85
            int r3 = ai.askquin.ui.conversation.r0.j2
            vz9 r0 = r0.q1
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r0.setValue(r3)
            wf4 r0 = new wf4
            ai.askquin.ui.conversation.r0 r3 = r14.this$0
            r0.<init>(r3, r1)
            r14.Z$0 = r15
            r14.label = r2
            java.lang.Object r15 = defpackage.lw2.b(r0, r14)
            if (r15 != r5) goto L7e
        L7d:
            return r5
        L7e:
            r15 = 2131887958(0x7f120756, float:1.9410538E38)
            defpackage.kv2.u(r15, r4)
            goto La2
        L85:
            int r15 = ai.askquin.ui.conversation.r0.j2
            vz9 r15 = r0.t1
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r15.setValue(r0)
            ai.askquin.ui.conversation.r0 r15 = r14.this$0
            sfb r0 = r15.s1
            vz9 r15 = r15.r1
            r15.setValue(r0)
            java.lang.Integer r15 = new java.lang.Integer
            r0 = 2131887955(0x7f120753, float:1.9410532E38)
            r15.<init>(r0)
            defpackage.jcc.k(r4, r15)
        La2:
            ai.askquin.ui.conversation.r0 r14 = r14.this$0
            int r15 = ai.askquin.ui.conversation.r0.j2
            vz9 r14 = r14.u1
            java.lang.Boolean r15 = java.lang.Boolean.FALSE
            r14.setValue(r15)
            wef r14 = defpackage.wef.a
            return r14
        Lb0:
            java.lang.String r14 = "divinationKey"
            defpackage.pa7.g0(r14)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xf4.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((xf4) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
