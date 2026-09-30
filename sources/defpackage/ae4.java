package defpackage;

import ai.askquin.R;
import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.draw.mixed.MixedDeckSnapshot;
import ai.askquin.ui.draw.model.DrawCardSaves;
import com.adjust.sdk.Constants;
import java.util.List;
import java.util.concurrent.CancellationException;
import tech.chatmind.api.PatternData;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ae4 extends gbe implements l26 {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae4(r0 r0Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = r0Var;
    }

    public static final boolean x(r0 r0Var, DrawCardSaves drawCardSaves, String str) {
        if (r0Var.J() != drawCardSaves) {
            return false;
        }
        fc4 fc4Var = r0Var.H0;
        if (fc4Var != null) {
            return pa7.t(fc4Var.a, str);
        }
        pa7.g0("divinationKey");
        throw null;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ae4(this.this$0, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0134 A[Catch: all -> 0x002f, Exception -> 0x0032, CancellationException -> 0x0035, TryCatch #3 {CancellationException -> 0x0035, Exception -> 0x0032, blocks: (B:9:0x002a, B:90:0x01cf, B:92:0x01d7, B:93:0x01db, B:20:0x0052, B:83:0x01a2, B:85:0x01aa, B:86:0x01ae, B:23:0x0063, B:70:0x0130, B:72:0x0134, B:75:0x013a, B:76:0x013d, B:78:0x0145, B:79:0x0148, B:26:0x0073, B:57:0x00ef, B:59:0x00f9, B:62:0x0100, B:64:0x0108, B:67:0x0110, B:95:0x021a, B:53:0x00d4), top: B:110:0x000c, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0137  */
    /* JADX WARN: Code duplicated, block: B:81:0x019e  */
    /* JADX WARN: Code duplicated, block: B:82:0x019f  */
    /* JADX WARN: Code duplicated, block: B:85:0x01aa A[Catch: all -> 0x002f, Exception -> 0x0032, CancellationException -> 0x0035, TryCatch #3 {CancellationException -> 0x0035, Exception -> 0x0032, blocks: (B:9:0x002a, B:90:0x01cf, B:92:0x01d7, B:93:0x01db, B:20:0x0052, B:83:0x01a2, B:85:0x01aa, B:86:0x01ae, B:23:0x0063, B:70:0x0130, B:72:0x0134, B:75:0x013a, B:76:0x013d, B:78:0x0145, B:79:0x0148, B:26:0x0073, B:57:0x00ef, B:59:0x00f9, B:62:0x0100, B:64:0x0108, B:67:0x0110, B:95:0x021a, B:53:0x00d4), top: B:110:0x000c, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01ae A[Catch: all -> 0x002f, Exception -> 0x0032, CancellationException -> 0x0035, TryCatch #3 {CancellationException -> 0x0035, Exception -> 0x0032, blocks: (B:9:0x002a, B:90:0x01cf, B:92:0x01d7, B:93:0x01db, B:20:0x0052, B:83:0x01a2, B:85:0x01aa, B:86:0x01ae, B:23:0x0063, B:70:0x0130, B:72:0x0134, B:75:0x013a, B:76:0x013d, B:78:0x0145, B:79:0x0148, B:26:0x0073, B:57:0x00ef, B:59:0x00f9, B:62:0x0100, B:64:0x0108, B:67:0x0110, B:95:0x021a, B:53:0x00d4), top: B:110:0x000c, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d7 A[Catch: all -> 0x002f, Exception -> 0x0032, CancellationException -> 0x0035, TryCatch #3 {CancellationException -> 0x0035, Exception -> 0x0032, blocks: (B:9:0x002a, B:90:0x01cf, B:92:0x01d7, B:93:0x01db, B:20:0x0052, B:83:0x01a2, B:85:0x01aa, B:86:0x01ae, B:23:0x0063, B:70:0x0130, B:72:0x0134, B:75:0x013a, B:76:0x013d, B:78:0x0145, B:79:0x0148, B:26:0x0073, B:57:0x00ef, B:59:0x00f9, B:62:0x0100, B:64:0x0108, B:67:0x0110, B:95:0x021a, B:53:0x00d4), top: B:110:0x000c, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01db A[Catch: all -> 0x002f, Exception -> 0x0032, CancellationException -> 0x0035, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x0035, Exception -> 0x0032, blocks: (B:9:0x002a, B:90:0x01cf, B:92:0x01d7, B:93:0x01db, B:20:0x0052, B:83:0x01a2, B:85:0x01aa, B:86:0x01ae, B:23:0x0063, B:70:0x0130, B:72:0x0134, B:75:0x013a, B:76:0x013d, B:78:0x0145, B:79:0x0148, B:26:0x0073, B:57:0x00ef, B:59:0x00f9, B:62:0x0100, B:64:0x0108, B:67:0x0110, B:95:0x021a, B:53:0x00d4), top: B:110:0x000c, outer: #2 }] */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object objA;
        DrawCardSaves drawCardSaves;
        String str;
        Boolean bool;
        Object objC;
        kx8 kx8Var;
        uc4 uc4Var;
        yc4 yc4VarA;
        String str2;
        kx8 kx8Var2;
        DrawCardSaves drawCardSaves2;
        rw8 rw8Var;
        String str3;
        DrawCardSaves drawCardSaves3;
        int i = this.label;
        boolean z = true;
        bw2 bw2Var = bw2.a;
        try {
            try {
                if (i == 0) {
                    jzb.q(obj);
                    r0 r0Var = this.this$0;
                    if (r0Var.A1 || !pa7.t(r0Var.U(), Constants.NORMAL)) {
                        return Boolean.FALSE;
                    }
                    DrawCardSaves drawCardSavesJ = this.this$0.J();
                    if (drawCardSavesJ == null) {
                        return Boolean.FALSE;
                    }
                    fc4 fc4Var = this.this$0.H0;
                    if (fc4Var == null) {
                        pa7.g0("divinationKey");
                        throw null;
                    }
                    String str4 = fc4Var.a;
                    if (!pa7.t(drawCardSavesJ.getChatId(), str4)) {
                        return Boolean.FALSE;
                    }
                    if (drawCardSavesJ.getMixedDeck() != null) {
                        return Boolean.TRUE;
                    }
                    if (!drawCardSavesJ.getChoices().isEmpty() || !drawCardSavesJ.getDrawnIndexes().isEmpty()) {
                        return Boolean.FALSE;
                    }
                    r0 r0Var2 = this.this$0;
                    r0Var2.A1 = true;
                    rw8 rw8Var2 = (rw8) r0Var2.B1.getValue();
                    this.L$0 = drawCardSavesJ;
                    this.L$1 = str4;
                    this.label = 1;
                    objA = rw8Var2.a(this);
                    if (objA != bw2Var) {
                        drawCardSaves = drawCardSavesJ;
                        str = str4;
                    }
                    return bw2Var;
                }
                if (i == 1) {
                    str = (String) this.L$1;
                    drawCardSaves = (DrawCardSaves) this.L$0;
                    jzb.q(obj);
                    objA = obj;
                } else {
                    if (i == 2) {
                        str = (String) this.L$1;
                        DrawCardSaves drawCardSaves4 = (DrawCardSaves) this.L$0;
                        jzb.q(obj);
                        drawCardSaves = drawCardSaves4;
                        objC = obj;
                        if (objC instanceof kx8) {
                            kx8Var = (kx8) objC;
                        } else {
                            kx8Var = null;
                        }
                        if (kx8Var == null && x(this.this$0, drawCardSaves, str)) {
                            r0 r0Var3 = this.this$0;
                            int i2 = r0.j2;
                            yc4 yc4VarW = r0Var3.w();
                            uc4Var = this.this$0.f;
                            yc4VarA = yc4.a(yc4VarW, null, false, null, null, 0, fb4.a(yc4VarW.h, null, null, null, null, null, null, null, null, kx8Var.a, 255), null, null, null, null, null, null, null, 4194175);
                            this.L$0 = drawCardSaves;
                            this.L$1 = str;
                            this.L$2 = null;
                            this.L$3 = kx8Var;
                            this.L$4 = null;
                            this.label = 3;
                            if (((gq3) uc4Var).h(yc4VarA, this) == bw2Var) {
                                str2 = str;
                                kx8Var2 = kx8Var;
                                drawCardSaves2 = drawCardSaves;
                                if (!x(this.this$0, drawCardSaves2, str2)) {
                                    r0 r0Var4 = this.this$0;
                                    int i3 = r0.j2;
                                    rw8Var = (rw8) r0Var4.B1.getValue();
                                    this.L$0 = drawCardSaves2;
                                    this.L$1 = str2;
                                    this.L$2 = null;
                                    this.L$3 = kx8Var2;
                                    this.L$4 = null;
                                    this.label = 4;
                                    if (rw8Var.b(this) != bw2Var) {
                                        str3 = str2;
                                        drawCardSaves3 = drawCardSaves2;
                                    }
                                } else {
                                    bool = Boolean.FALSE;
                                }
                            }
                            return bw2Var;
                        }
                        bool = Boolean.FALSE;
                        this.this$0.A1 = false;
                        return bool;
                    }
                    if (i == 3) {
                        kx8Var2 = (kx8) this.L$3;
                        str2 = (String) this.L$1;
                        drawCardSaves2 = (DrawCardSaves) this.L$0;
                        jzb.q(obj);
                        if (!x(this.this$0, drawCardSaves2, str2)) {
                            r0 r0Var5 = this.this$0;
                            int i4 = r0.j2;
                            rw8Var = (rw8) r0Var5.B1.getValue();
                            this.L$0 = drawCardSaves2;
                            this.L$1 = str2;
                            this.L$2 = null;
                            this.L$3 = kx8Var2;
                            this.L$4 = null;
                            this.label = 4;
                            if (rw8Var.b(this) != bw2Var) {
                                str3 = str2;
                                drawCardSaves3 = drawCardSaves2;
                            }
                            return bw2Var;
                        }
                        bool = Boolean.FALSE;
                        this.this$0.A1 = false;
                        return bool;
                    }
                    if (i != 4) {
                        qc0.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kx8Var2 = (kx8) this.L$3;
                    str3 = (String) this.L$1;
                    drawCardSaves3 = (DrawCardSaves) this.L$0;
                    jzb.q(obj);
                }
                if (x(this.this$0, drawCardSaves3, str3)) {
                    bool = Boolean.FALSE;
                    this.this$0.A1 = false;
                    return bool;
                }
                r0 r0Var6 = this.this$0;
                MixedDeckSnapshot mixedDeckSnapshot = kx8Var2.a;
                int i5 = r0.j2;
                r0Var6.D1(mixedDeckSnapshot);
                r0 r0Var7 = this.this$0;
                nm4 nm4Var = DrawCardSaves.Companion;
                String chatId = drawCardSaves3.getChatId();
                List<PatternData> patterns = drawCardSaves3.getPatterns();
                List<TarotCardChoice> choices = drawCardSaves3.getChoices();
                List<Integer> drawnIndexes = drawCardSaves3.getDrawnIndexes();
                MixedDeckSnapshot mixedDeckSnapshot2 = kx8Var2.a;
                nm4Var.getClass();
                DrawCardSaves drawCardSavesA = nm4.a(chatId, patterns, choices, drawnIndexes, mixedDeckSnapshot2);
                r0Var7.getClass();
                r0Var7.z1(drawCardSavesA);
                this.this$0.J1.setValue(null);
                this.this$0.d1("mixed_tarot");
                this.this$0.A1 = false;
                return Boolean.valueOf(z);
                hw8 hw8Var = (hw8) objA;
                if (x(this.this$0, drawCardSaves, str) && hw8Var.a.a() && hw8Var.a()) {
                    r0 r0Var8 = this.this$0;
                    int i6 = r0.j2;
                    rw8 rw8Var3 = (rw8) r0Var8.B1.getValue();
                    String chatId2 = drawCardSaves.getChatId();
                    this.L$0 = drawCardSaves;
                    this.L$1 = str;
                    this.L$2 = null;
                    this.label = 2;
                    objC = rw8Var3.c(chatId2, this);
                    if (objC != bw2Var) {
                        if (objC instanceof kx8) {
                            kx8Var = (kx8) objC;
                        } else {
                            kx8Var = null;
                        }
                        if (kx8Var == null) {
                            bool = Boolean.FALSE;
                        } else {
                            r0 r0Var9 = this.this$0;
                            int i7 = r0.j2;
                            yc4 yc4VarW2 = r0Var9.w();
                            uc4Var = this.this$0.f;
                            yc4VarA = yc4.a(yc4VarW2, null, false, null, null, 0, fb4.a(yc4VarW2.h, null, null, null, null, null, null, null, null, kx8Var.a, 255), null, null, null, null, null, null, null, 4194175);
                            this.L$0 = drawCardSaves;
                            this.L$1 = str;
                            this.L$2 = null;
                            this.L$3 = kx8Var;
                            this.L$4 = null;
                            this.label = 3;
                            if (((gq3) uc4Var).h(yc4VarA, this) == bw2Var) {
                                str2 = str;
                                kx8Var2 = kx8Var;
                                drawCardSaves2 = drawCardSaves;
                                if (!x(this.this$0, drawCardSaves2, str2)) {
                                    bool = Boolean.FALSE;
                                } else {
                                    r0 r0Var10 = this.this$0;
                                    int i8 = r0.j2;
                                    rw8Var = (rw8) r0Var10.B1.getValue();
                                    this.L$0 = drawCardSaves2;
                                    this.L$1 = str2;
                                    this.L$2 = null;
                                    this.L$3 = kx8Var2;
                                    this.L$4 = null;
                                    this.label = 4;
                                    if (rw8Var.b(this) != bw2Var) {
                                        str3 = str2;
                                        drawCardSaves3 = drawCardSaves2;
                                        if (x(this.this$0, drawCardSaves3, str3)) {
                                            r0 r0Var11 = this.this$0;
                                            MixedDeckSnapshot mixedDeckSnapshot3 = kx8Var2.a;
                                            int i9 = r0.j2;
                                            r0Var11.D1(mixedDeckSnapshot3);
                                            r0 r0Var12 = this.this$0;
                                            nm4 nm4Var2 = DrawCardSaves.Companion;
                                            String chatId3 = drawCardSaves3.getChatId();
                                            List<PatternData> patterns2 = drawCardSaves3.getPatterns();
                                            List<TarotCardChoice> choices2 = drawCardSaves3.getChoices();
                                            List<Integer> drawnIndexes2 = drawCardSaves3.getDrawnIndexes();
                                            MixedDeckSnapshot mixedDeckSnapshot4 = kx8Var2.a;
                                            nm4Var2.getClass();
                                            DrawCardSaves drawCardSavesA2 = nm4.a(chatId3, patterns2, choices2, drawnIndexes2, mixedDeckSnapshot4);
                                            r0Var12.getClass();
                                            r0Var12.z1(drawCardSavesA2);
                                            this.this$0.J1.setValue(null);
                                            this.this$0.d1("mixed_tarot");
                                            this.this$0.A1 = false;
                                            return Boolean.valueOf(z);
                                        }
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                        }
                    }
                    return bw2Var;
                }
                bool = Boolean.FALSE;
                this.this$0.A1 = false;
                return bool;
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                this.this$0.d().c("Failed to confirm mixed deck", e2);
                jcc.k(0, new Integer(R.string.network_common_error));
                this.this$0.A1 = false;
                z = false;
            }
        } catch (Throwable th) {
            this.this$0.A1 = false;
            throw th;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ae4) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
