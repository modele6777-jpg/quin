package defpackage;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import tech.chatmind.api.PopupData;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jna extends gbe implements l26 {
    final /* synthetic */ boolean $force;
    int I$0;
    int label;
    final /* synthetic */ qna this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jna(boolean z, qna qnaVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$force = z;
        this.this$0 = qnaVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new jna(this.$force, this.this$0, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f6 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:7:0x001c, B:39:0x00ea, B:41:0x00f6, B:43:0x00fb, B:62:0x0191, B:59:0x0170, B:61:0x0177, B:47:0x0109, B:49:0x0111, B:51:0x0117, B:52:0x012c, B:54:0x013e, B:56:0x0144, B:63:0x01a4, B:65:0x01ac, B:13:0x002a, B:21:0x0041, B:23:0x0058, B:24:0x006e, B:27:0x007e, B:31:0x009b, B:35:0x00b6, B:16:0x0031, B:18:0x0035), top: B:69:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00fb A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:7:0x001c, B:39:0x00ea, B:41:0x00f6, B:43:0x00fb, B:62:0x0191, B:59:0x0170, B:61:0x0177, B:47:0x0109, B:49:0x0111, B:51:0x0117, B:52:0x012c, B:54:0x013e, B:56:0x0144, B:63:0x01a4, B:65:0x01ac, B:13:0x002a, B:21:0x0041, B:23:0x0058, B:24:0x006e, B:27:0x007e, B:31:0x009b, B:35:0x00b6, B:16:0x0031, B:18:0x0035), top: B:69:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0105  */
    /* JADX WARN: Code duplicated, block: B:46:0x0108 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:47:0x0109 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:7:0x001c, B:39:0x00ea, B:41:0x00f6, B:43:0x00fb, B:62:0x0191, B:59:0x0170, B:61:0x0177, B:47:0x0109, B:49:0x0111, B:51:0x0117, B:52:0x012c, B:54:0x013e, B:56:0x0144, B:63:0x01a4, B:65:0x01ac, B:13:0x002a, B:21:0x0041, B:23:0x0058, B:24:0x006e, B:27:0x007e, B:31:0x009b, B:35:0x00b6, B:16:0x0031, B:18:0x0035), top: B:69:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0117 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:7:0x001c, B:39:0x00ea, B:41:0x00f6, B:43:0x00fb, B:62:0x0191, B:59:0x0170, B:61:0x0177, B:47:0x0109, B:49:0x0111, B:51:0x0117, B:52:0x012c, B:54:0x013e, B:56:0x0144, B:63:0x01a4, B:65:0x01ac, B:13:0x002a, B:21:0x0041, B:23:0x0058, B:24:0x006e, B:27:0x007e, B:31:0x009b, B:35:0x00b6, B:16:0x0031, B:18:0x0035), top: B:69:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x012c A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:7:0x001c, B:39:0x00ea, B:41:0x00f6, B:43:0x00fb, B:62:0x0191, B:59:0x0170, B:61:0x0177, B:47:0x0109, B:49:0x0111, B:51:0x0117, B:52:0x012c, B:54:0x013e, B:56:0x0144, B:63:0x01a4, B:65:0x01ac, B:13:0x002a, B:21:0x0041, B:23:0x0058, B:24:0x006e, B:27:0x007e, B:31:0x009b, B:35:0x00b6, B:16:0x0031, B:18:0x0035), top: B:69:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x013e A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:7:0x001c, B:39:0x00ea, B:41:0x00f6, B:43:0x00fb, B:62:0x0191, B:59:0x0170, B:61:0x0177, B:47:0x0109, B:49:0x0111, B:51:0x0117, B:52:0x012c, B:54:0x013e, B:56:0x0144, B:63:0x01a4, B:65:0x01ac, B:13:0x002a, B:21:0x0041, B:23:0x0058, B:24:0x006e, B:27:0x007e, B:31:0x009b, B:35:0x00b6, B:16:0x0031, B:18:0x0035), top: B:69:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0144 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:7:0x001c, B:39:0x00ea, B:41:0x00f6, B:43:0x00fb, B:62:0x0191, B:59:0x0170, B:61:0x0177, B:47:0x0109, B:49:0x0111, B:51:0x0117, B:52:0x012c, B:54:0x013e, B:56:0x0144, B:63:0x01a4, B:65:0x01ac, B:13:0x002a, B:21:0x0041, B:23:0x0058, B:24:0x006e, B:27:0x007e, B:31:0x009b, B:35:0x00b6, B:16:0x0031, B:18:0x0035), top: B:69:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x016f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:59:0x0170 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:7:0x001c, B:39:0x00ea, B:41:0x00f6, B:43:0x00fb, B:62:0x0191, B:59:0x0170, B:61:0x0177, B:47:0x0109, B:49:0x0111, B:51:0x0117, B:52:0x012c, B:54:0x013e, B:56:0x0144, B:63:0x01a4, B:65:0x01ac, B:13:0x002a, B:21:0x0041, B:23:0x0058, B:24:0x006e, B:27:0x007e, B:31:0x009b, B:35:0x00b6, B:16:0x0031, B:18:0x0035), top: B:69:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x01ac A[Catch: all -> 0x0021, TRY_LEAVE, TryCatch #0 {all -> 0x0021, blocks: (B:7:0x001c, B:39:0x00ea, B:41:0x00f6, B:43:0x00fb, B:62:0x0191, B:59:0x0170, B:61:0x0177, B:47:0x0109, B:49:0x0111, B:51:0x0117, B:52:0x012c, B:54:0x013e, B:56:0x0144, B:63:0x01a4, B:65:0x01ac, B:13:0x002a, B:21:0x0041, B:23:0x0058, B:24:0x006e, B:27:0x007e, B:31:0x009b, B:35:0x00b6, B:16:0x0031, B:18:0x0035), top: B:69:0x0014 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x0117, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x01ac, please report this as an issue */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i;
        qna qnaVar;
        Object objB;
        qna qnaVar2;
        qna qnaVar3;
        Throwable thA;
        PopupData popupData;
        Integer num;
        String actionLink;
        qn2 qn2Var;
        int i2 = this.label;
        wef wefVar = wef.a;
        int i3 = 1;
        bw2 bw2Var = bw2.a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    jzb.q(obj);
                } else {
                    if (i2 != 2) {
                        qc0.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = this.I$0;
                    jzb.q(obj);
                }
                objB = ((ezb) obj).b();
                qnaVar2 = this.this$0;
                if (!(objB instanceof dzb)) {
                    popupData = (PopupData) objB;
                    if (popupData != null) {
                        num = new Integer(popupData.getPopupCode());
                    } else {
                        num = null;
                    }
                    if (num == null && num.intValue() == 1001) {
                        actionLink = popupData.getActionLink();
                        if (actionLink == null) {
                            qnaVar2.d().b("no link in popup data: " + popupData);
                        } else {
                            hs3 hs3Var = xqa.T;
                            Boolean bool = Boolean.TRUE;
                            isa isaVar = hs3Var.a;
                            qn2Var = lw2.a;
                            ynb.V(qn2Var, null, null, new cna(isaVar, bool, null), 3);
                            if (i == 0 || !popupData.canCancel()) {
                                ynb.V(qn2Var, null, null, new fna(xqa.S.a, Instant.now().toString(), null), 3);
                                vma vmaVar = new vma(actionLink, popupData.getContent(), popupData.canCancel());
                                int i4 = qna.v;
                                qnaVar2.e.setValue(vmaVar);
                            }
                        }
                    } else if (num == null && num.intValue() == -1) {
                        qnaVar2.d().e("no popup data");
                        hs3 hs3Var2 = xqa.T;
                        ynb.V(lw2.a, null, null, new ina(hs3Var2.a, Boolean.FALSE, null), 3);
                    } else {
                        qnaVar2.d().g("unknown popup code: " + popupData);
                    }
                }
                qnaVar3 = this.this$0;
                thA = ezb.a(objB);
                if (thA != null) {
                    qnaVar3.d().g("failed to check popup: " + thA.getMessage());
                }
                qnaVar = this.this$0;
                int i5 = qna.v;
                qnaVar.f.setValue(Boolean.TRUE);
                return wefVar;
            }
            jzb.q(obj);
            if (this.$force) {
                this.this$0.d().e("start check update");
                hs3 hs3Var3 = xqa.R;
                ynb.V(lw2.a, null, null, new zma(hs3Var3.a, Instant.now().toString(), null), 3);
                wma wmaVar = new wma(this.this$0, null);
                this.I$0 = i3;
                this.label = 2;
                obj = lw2.b(wmaVar, this);
                if (obj != bw2Var) {
                    i = i3;
                    objB = ((ezb) obj).b();
                    qnaVar2 = this.this$0;
                    if (!(objB instanceof dzb)) {
                        popupData = (PopupData) objB;
                        if (popupData != null) {
                            num = new Integer(popupData.getPopupCode());
                        } else {
                            num = null;
                        }
                        if (num == null) {
                            actionLink = popupData.getActionLink();
                            if (actionLink == null) {
                                qnaVar2.d().b("no link in popup data: " + popupData);
                            } else {
                                hs3 hs3Var4 = xqa.T;
                                Boolean bool2 = Boolean.TRUE;
                                isa isaVar2 = hs3Var4.a;
                                qn2Var = lw2.a;
                                ynb.V(qn2Var, null, null, new cna(isaVar2, bool2, null), 3);
                                if (i == 0) {
                                    ynb.V(qn2Var, null, null, new fna(xqa.S.a, Instant.now().toString(), null), 3);
                                    vma vmaVar2 = new vma(actionLink, popupData.getContent(), popupData.canCancel());
                                    int i6 = qna.v;
                                    qnaVar2.e.setValue(vmaVar2);
                                } else {
                                    ynb.V(qn2Var, null, null, new fna(xqa.S.a, Instant.now().toString(), null), 3);
                                    vma vmaVar3 = new vma(actionLink, popupData.getContent(), popupData.canCancel());
                                    int i7 = qna.v;
                                    qnaVar2.e.setValue(vmaVar3);
                                }
                            }
                        }
                        if (num == null) {
                            qnaVar2.d().e("no popup data");
                            hs3 hs3Var5 = xqa.T;
                            ynb.V(lw2.a, null, null, new ina(hs3Var5.a, Boolean.FALSE, null), 3);
                        }
                        qnaVar2.d().g("unknown popup code: " + popupData);
                    }
                    qnaVar3 = this.this$0;
                    thA = ezb.a(objB);
                    if (thA != null) {
                        qnaVar3.d().g("failed to check popup: " + thA.getMessage());
                    }
                    qnaVar = this.this$0;
                    int i8 = qna.v;
                    qnaVar.f.setValue(Boolean.TRUE);
                    return wefVar;
                }
            } else {
                this.label = 1;
                if (vfh.q(2000L, this) == bw2Var) {
                }
            }
            return bw2Var;
            Instant instantNow = Instant.now();
            qna qnaVar4 = this.this$0;
            hs3 hs3Var6 = xqa.R;
            int i9 = qna.v;
            qnaVar4.getClass();
            Instant instantG = qna.g(hs3Var6);
            if (instantG.isAfter(instantNow)) {
                this.this$0.d().g("last check time is after now, use now: " + instantG);
                instantG = instantNow;
            }
            boolean zIsBefore = instantG.plus(15L, (TemporalUnit) ChronoUnit.MINUTES).isBefore(instantNow);
            qna qnaVar5 = this.this$0;
            if (zIsBefore) {
                hs3 hs3Var7 = xqa.S;
                qnaVar5.getClass();
                Instant instantG2 = qna.g(hs3Var7);
                ChronoUnit chronoUnit = ChronoUnit.DAYS;
                if (pa7.t(instantG2.truncatedTo(chronoUnit), instantNow.truncatedTo(chronoUnit))) {
                    i3 = 0;
                }
                this.this$0.d().e("start check update");
                hs3 hs3Var8 = xqa.R;
                ynb.V(lw2.a, null, null, new zma(hs3Var8.a, Instant.now().toString(), null), 3);
                wma wmaVar2 = new wma(this.this$0, null);
                this.I$0 = i3;
                this.label = 2;
                obj = lw2.b(wmaVar2, this);
                if (obj != bw2Var) {
                    i = i3;
                    objB = ((ezb) obj).b();
                    qnaVar2 = this.this$0;
                    if (!(objB instanceof dzb)) {
                        popupData = (PopupData) objB;
                        if (popupData != null) {
                            num = new Integer(popupData.getPopupCode());
                        } else {
                            num = null;
                        }
                        if (num == null) {
                            actionLink = popupData.getActionLink();
                            if (actionLink == null) {
                                qnaVar2.d().b("no link in popup data: " + popupData);
                            } else {
                                hs3 hs3Var9 = xqa.T;
                                Boolean bool3 = Boolean.TRUE;
                                isa isaVar3 = hs3Var9.a;
                                qn2Var = lw2.a;
                                ynb.V(qn2Var, null, null, new cna(isaVar3, bool3, null), 3);
                                if (i == 0) {
                                    ynb.V(qn2Var, null, null, new fna(xqa.S.a, Instant.now().toString(), null), 3);
                                    vma vmaVar4 = new vma(actionLink, popupData.getContent(), popupData.canCancel());
                                    int i10 = qna.v;
                                    qnaVar2.e.setValue(vmaVar4);
                                } else {
                                    ynb.V(qn2Var, null, null, new fna(xqa.S.a, Instant.now().toString(), null), 3);
                                    vma vmaVar5 = new vma(actionLink, popupData.getContent(), popupData.canCancel());
                                    int i11 = qna.v;
                                    qnaVar2.e.setValue(vmaVar5);
                                }
                            }
                        }
                        if (num == null) {
                            qnaVar2.d().e("no popup data");
                            hs3 hs3Var10 = xqa.T;
                            ynb.V(lw2.a, null, null, new ina(hs3Var10.a, Boolean.FALSE, null), 3);
                        }
                        qnaVar2.d().g("unknown popup code: " + popupData);
                    }
                    qnaVar3 = this.this$0;
                    thA = ezb.a(objB);
                    if (thA != null) {
                        qnaVar3.d().g("failed to check popup: " + thA.getMessage());
                    }
                    qnaVar = this.this$0;
                    int i12 = qna.v;
                }
                return bw2Var;
            }
            qnaVar5.d().e("skip check update not past 15 min: " + instantG);
            qnaVar = this.this$0;
            qnaVar.f.setValue(Boolean.TRUE);
            return wefVar;
        } catch (Throwable th) {
            qna qnaVar6 = this.this$0;
            int i13 = qna.v;
            qnaVar6.f.setValue(Boolean.TRUE);
            throw th;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((jna) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
