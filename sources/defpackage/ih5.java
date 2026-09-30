package defpackage;

import ai.askquin.ui.paywall.upgrade.s;
import java.util.concurrent.CancellationException;
import tech.chatmind.api.credits.QuotaUsage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ih5 extends gbe implements l26 {
    final /* synthetic */ String $accountId;
    final /* synthetic */ iy9 $key;
    final /* synthetic */ String $readingId;
    Object L$0;
    int label;
    final /* synthetic */ s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih5(s sVar, String str, String str2, iy9 iy9Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = sVar;
        this.$accountId = str;
        this.$readingId = str2;
        this.$key = iy9Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ih5(this.this$0, this.$accountId, this.$readingId, this.$key, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0093 A[Catch: all -> 0x002b, Exception -> 0x002e, CancellationException -> 0x0031, TRY_ENTER, TryCatch #3 {CancellationException -> 0x0031, Exception -> 0x002e, blocks: (B:11:0x0026, B:21:0x003c, B:32:0x0078, B:37:0x0093, B:39:0x009f, B:24:0x0043, B:29:0x0067), top: B:56:0x0007, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x009f A[Catch: all -> 0x002b, Exception -> 0x002e, CancellationException -> 0x0031, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x0031, Exception -> 0x002e, blocks: (B:11:0x0026, B:21:0x003c, B:32:0x0078, B:37:0x0093, B:39:0x009f, B:24:0x0043, B:29:0x0067), top: B:56:0x0007, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00af  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x0100 A[RETURN] */
    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        QuotaUsage quotaUsage;
        s sVar;
        String str;
        s sVar2;
        String str2;
        fg9 fg9Var;
        hh5 hh5Var;
        fg9 fg9Var2;
        hh5 hh5Var2;
        int i = this.label;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        try {
            try {
                switch (i) {
                    case 0:
                        jzb.q(obj);
                        s sVar3 = this.this$0;
                        String str3 = this.$accountId;
                        int i2 = s.g;
                        if (sVar3.e(str3)) {
                            s sVar4 = this.this$0;
                            String str4 = this.$accountId;
                            String str5 = this.$readingId;
                            this.label = 2;
                            obj = sVar4.m(str4, str5, this);
                            if (obj != bw2Var) {
                                quotaUsage = (QuotaUsage) obj;
                                if (quotaUsage == null) {
                                    fg9Var = fg9.b;
                                    hh5Var = new hh5(this.this$0, this.$key, null);
                                    this.L$0 = wefVar;
                                    this.label = 3;
                                    if (ynb.p0(fg9Var, hh5Var, this) == bw2Var) {
                                        return wefVar;
                                    }
                                } else {
                                    sVar = this.this$0;
                                    str = this.$accountId;
                                    int i3 = s.g;
                                    if (sVar.e(str)) {
                                        sVar2 = this.this$0;
                                        str2 = this.$accountId;
                                        this.L$0 = null;
                                        this.label = 4;
                                        if (sVar2.k(str2, quotaUsage, this) != bw2Var) {
                                            fg9Var2 = fg9.b;
                                            hh5Var2 = new hh5(this.this$0, this.$key, null);
                                            this.L$0 = null;
                                            this.label = 5;
                                            if (ynb.p0(fg9Var2, hh5Var2, this) == bw2Var) {
                                                return wefVar;
                                            }
                                        }
                                    } else {
                                        fg9Var2 = fg9.b;
                                        hh5Var2 = new hh5(this.this$0, this.$key, null);
                                        this.L$0 = null;
                                        this.label = 5;
                                        if (ynb.p0(fg9Var2, hh5Var2, this) == bw2Var) {
                                            return wefVar;
                                        }
                                    }
                                }
                            }
                        } else {
                            fg9 fg9Var3 = fg9.b;
                            hh5 hh5Var3 = new hh5(this.this$0, this.$key, null);
                            this.L$0 = wefVar;
                            this.label = 1;
                            if (ynb.p0(fg9Var3, hh5Var3, this) != bw2Var) {
                                return wefVar;
                            }
                        }
                        return bw2Var;
                    case 1:
                    case 3:
                        wef wefVar2 = (wef) this.L$0;
                        jzb.q(obj);
                        return wefVar2;
                    case 2:
                        jzb.q(obj);
                        quotaUsage = (QuotaUsage) obj;
                        if (quotaUsage == null) {
                            fg9Var = fg9.b;
                            hh5Var = new hh5(this.this$0, this.$key, null);
                            this.L$0 = wefVar;
                            this.label = 3;
                            if (ynb.p0(fg9Var, hh5Var, this) == bw2Var) {
                                return wefVar;
                            }
                        } else {
                            sVar = this.this$0;
                            str = this.$accountId;
                            int i4 = s.g;
                            if (sVar.e(str)) {
                                sVar2 = this.this$0;
                                str2 = this.$accountId;
                                this.L$0 = null;
                                this.label = 4;
                                if (sVar2.k(str2, quotaUsage, this) != bw2Var) {
                                    fg9Var2 = fg9.b;
                                    hh5Var2 = new hh5(this.this$0, this.$key, null);
                                    this.L$0 = null;
                                    this.label = 5;
                                    if (ynb.p0(fg9Var2, hh5Var2, this) == bw2Var) {
                                        return wefVar;
                                    }
                                }
                            } else {
                                fg9Var2 = fg9.b;
                                hh5Var2 = new hh5(this.this$0, this.$key, null);
                                this.L$0 = null;
                                this.label = 5;
                                if (ynb.p0(fg9Var2, hh5Var2, this) == bw2Var) {
                                    return wefVar;
                                }
                            }
                        }
                        return bw2Var;
                    case 4:
                        jzb.q(obj);
                        fg9Var2 = fg9.b;
                        hh5Var2 = new hh5(this.this$0, this.$key, null);
                        this.L$0 = null;
                        this.label = 5;
                        if (ynb.p0(fg9Var2, hh5Var2, this) == bw2Var) {
                            return bw2Var;
                        }
                        return wefVar;
                    case 5:
                        jzb.q(obj);
                        return wefVar;
                    case 6:
                        jzb.q(obj);
                        return wefVar;
                    case 7:
                        Throwable th = (Throwable) this.L$0;
                        jzb.q(obj);
                        throw th;
                    default:
                        qc0.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                this.this$0.d().h("Failed to persist five-card upgrade confirmation", e2);
                fg9 fg9Var4 = fg9.b;
                hh5 hh5Var4 = new hh5(this.this$0, this.$key, null);
                this.L$0 = null;
                this.label = 6;
                if (ynb.p0(fg9Var4, hh5Var4, this) == bw2Var) {
                    return bw2Var;
                }
            }
        } catch (Throwable th2) {
            fg9 fg9Var5 = fg9.b;
            hh5 hh5Var5 = new hh5(this.this$0, this.$key, null);
            this.L$0 = th2;
            this.label = 7;
            if (ynb.p0(fg9Var5, hh5Var5, this) != bw2Var) {
                throw th2;
            }
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ih5) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
