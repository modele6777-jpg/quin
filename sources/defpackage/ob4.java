package defpackage;

import ai.askquin.ui.conversation.PhysicalDeckReading;
import ai.askquin.ui.conversation.SceneTarot;
import ai.askquin.ui.persistence.database.InterruptedDrawing;
import ai.askquin.ui.persistence.database.d;
import ai.askquin.ui.persistence.serialization.r0;
import java.time.Instant;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ob4 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ vb4 c;

    public /* synthetic */ ob4(String str, vb4 vb4Var, int i) {
        this.a = i;
        this.b = str;
        this.c = vb4Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) throws Exception {
        Object dzbVar;
        int i = this.a;
        int i2 = 7;
        fb4 fb4VarA = null;
        wc4 wc4Var = null;
        String strT0 = null;
        yc4 yc4Var = null;
        fb4VarA = null;
        int i3 = 1;
        vb4 vb4Var = this.c;
        String str = this.b;
        switch (i) {
            case 0:
                q8c q8cVar = (q8c) obj;
                q8cVar.getClass();
                x8c x8cVarW0 = q8cVar.W0("SELECT id,createAt,updateAt,drawnAt,title,content,hasFeedback,sceneTarot,interruptedDrawing,divinationType,usedSkinType,selectedAiSpreadIndex,physicalDeckReading FROM divination WHERE syncedAt IS NULL AND isLocalOnly = 0 AND deletedAt IS NULL AND accountId = ? ORDER BY createAt ASC LIMIT ?");
                try {
                    x8cVarW0.Q(1, str);
                    x8cVarW0.m(2, 50L);
                    ArrayList arrayList = new ArrayList();
                    while (x8cVarW0.R0()) {
                        String strT1 = x8cVarW0.t0(0);
                        Instant instantI = yx4.i(x8cVarW0.isNull(i3) ? null : x8cVarW0.t0(i3));
                        if (instantI == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                        }
                        Instant instantI2 = yx4.i(x8cVarW0.isNull(2) ? null : x8cVarW0.t0(2));
                        if (instantI2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                        }
                        Instant instantI3 = yx4.i(x8cVarW0.isNull(3) ? null : x8cVarW0.t0(3));
                        String strT2 = x8cVarW0.t0(4);
                        String strT3 = x8cVarW0.isNull(5) ? null : x8cVarW0.t0(5);
                        fb4 fb4VarA2 = strT3 == null ? null : ((r0) vb4Var.d.b).a(strT3);
                        if (fb4VarA2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'ai.askquin.ui.persistence.query.DivinationContent', but it was NULL.");
                        }
                        vb4 vb4Var2 = vb4Var;
                        boolean z = ((int) x8cVarW0.getLong(6)) != 0;
                        String strT4 = x8cVarW0.isNull(i2) ? null : x8cVarW0.t0(i2);
                        xh7 xh7Var = fzc.a;
                        SceneTarot sceneTarot = strT4 == null ? null : (SceneTarot) xh7Var.b(SceneTarot.Companion.serializer(), strT4);
                        String strT5 = x8cVarW0.isNull(8) ? null : x8cVarW0.t0(8);
                        InterruptedDrawing interruptedDrawing = strT5 == null ? null : (InterruptedDrawing) xh7Var.b(InterruptedDrawing.Companion.serializer(), strT5);
                        String strT6 = x8cVarW0.isNull(9) ? null : x8cVarW0.t0(9);
                        String strT7 = x8cVarW0.isNull(10) ? null : x8cVarW0.t0(10);
                        Integer numValueOf = x8cVarW0.isNull(11) ? null : Integer.valueOf((int) x8cVarW0.getLong(11));
                        String strT8 = x8cVarW0.isNull(12) ? null : x8cVarW0.t0(12);
                        arrayList.add(new dc4(strT1, instantI, instantI2, instantI3, strT2, fb4VarA2, z, sceneTarot, interruptedDrawing, strT6, strT7, numValueOf, strT8 == null ? null : (PhysicalDeckReading) xh7Var.b(PhysicalDeckReading.Companion.serializer(), strT8)));
                        vb4Var = vb4Var2;
                        i3 = 1;
                        i2 = 7;
                    }
                    x8cVarW0.close();
                    return arrayList;
                } catch (Throwable th) {
                    x8cVarW0.close();
                    throw th;
                }
            case 1:
                q8c q8cVar2 = (q8c) obj;
                q8cVar2.getClass();
                x8c x8cVarW1 = q8cVar2.W0("SELECT content FROM divination WHERE id = ? LIMIT 1");
                try {
                    x8cVarW1.Q(1, str);
                    if (x8cVarW1.R0()) {
                        String strT9 = x8cVarW1.isNull(0) ? null : x8cVarW1.t0(0);
                        r0 r0Var = (r0) vb4Var.d.b;
                        if (strT9 != null) {
                            fb4VarA = r0Var.a(strT9);
                            break;
                        }
                    }
                    return fb4VarA;
                } finally {
                    x8cVarW1.close();
                }
            case 2:
                q8c q8cVar3 = (q8c) obj;
                q8cVar3.getClass();
                x8c x8cVarW2 = q8cVar3.W0("SELECT id,createAt,updateAt,drawnAt,title,messageCount,content,hasFeedback,sceneTarot,interruptedDrawing,divinationType,usedSkinType,selectedAiSpreadIndex,syncedAt,deletedAt,accountId,physicalDeckReading,previewMessage,readState,summaryCards,isLocalOnly FROM divination WHERE id = ? LIMIT 1");
                try {
                    x8cVarW2.Q(1, str);
                    if (x8cVarW2.R0()) {
                        String strT10 = x8cVarW2.t0(0);
                        Instant instantI4 = yx4.i(x8cVarW2.isNull(1) ? null : x8cVarW2.t0(1));
                        if (instantI4 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                        }
                        Instant instantI5 = yx4.i(x8cVarW2.isNull(2) ? null : x8cVarW2.t0(2));
                        if (instantI5 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                        }
                        Instant instantI6 = yx4.i(x8cVarW2.isNull(3) ? null : x8cVarW2.t0(3));
                        String strT11 = x8cVarW2.t0(4);
                        int i4 = (int) x8cVarW2.getLong(5);
                        String strT12 = x8cVarW2.isNull(6) ? null : x8cVarW2.t0(6);
                        fb4 fb4VarA3 = strT12 == null ? null : ((r0) vb4Var.d.b).a(strT12);
                        if (fb4VarA3 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'ai.askquin.ui.persistence.query.DivinationContent', but it was NULL.");
                        }
                        boolean z2 = ((int) x8cVarW2.getLong(7)) != 0;
                        String strT13 = x8cVarW2.isNull(8) ? null : x8cVarW2.t0(8);
                        xh7 xh7Var2 = fzc.a;
                        SceneTarot sceneTarot2 = strT13 == null ? null : (SceneTarot) xh7Var2.b(SceneTarot.Companion.serializer(), strT13);
                        String strT14 = x8cVarW2.isNull(9) ? null : x8cVarW2.t0(9);
                        InterruptedDrawing interruptedDrawing2 = strT14 == null ? null : (InterruptedDrawing) xh7Var2.b(InterruptedDrawing.Companion.serializer(), strT14);
                        String strT15 = x8cVarW2.isNull(10) ? null : x8cVarW2.t0(10);
                        String strT16 = x8cVarW2.isNull(11) ? null : x8cVarW2.t0(11);
                        Integer numValueOf2 = x8cVarW2.isNull(12) ? null : Integer.valueOf((int) x8cVarW2.getLong(12));
                        Instant instantI7 = yx4.i(x8cVarW2.isNull(13) ? null : x8cVarW2.t0(13));
                        Instant instantI8 = yx4.i(x8cVarW2.isNull(14) ? null : x8cVarW2.t0(14));
                        String strT17 = x8cVarW2.t0(15);
                        String strT18 = x8cVarW2.isNull(16) ? null : x8cVarW2.t0(16);
                        PhysicalDeckReading physicalDeckReading = strT18 == null ? null : (PhysicalDeckReading) xh7Var2.b(PhysicalDeckReading.Companion.serializer(), strT18);
                        String strT19 = x8cVarW2.t0(17);
                        String strT20 = x8cVarW2.t0(18);
                        strT20.getClass();
                        try {
                            dzbVar = tdb.valueOf(strT20);
                        } catch (Throwable th2) {
                            dzbVar = new dzb(th2);
                        }
                        tdb tdbVar = tdb.b;
                        boolean z3 = dzbVar instanceof dzb;
                        Object obj2 = dzbVar;
                        if (z3) {
                            obj2 = tdbVar;
                        }
                        tdb tdbVar2 = (tdb) obj2;
                        if (!x8cVarW2.isNull(19)) {
                            strT0 = x8cVarW2.t0(19);
                        }
                        yc4Var = new yc4(strT10, ((int) x8cVarW2.getLong(20)) != 0, instantI4, instantI5, instantI6, strT11, i4, fb4VarA3, z2, sceneTarot2, interruptedDrawing2, strT15, strT16, null, numValueOf2, instantI7, instantI8, strT17, physicalDeckReading, strT19, tdbVar2, d.b(strT0));
                        break;
                    }
                    x8cVarW2.close();
                    return yc4Var;
                } catch (Throwable th3) {
                    x8cVarW2.close();
                    throw th3;
                }
            case 3:
                q8c q8cVar4 = (q8c) obj;
                q8cVar4.getClass();
                x8c x8cVarW3 = q8cVar4.W0("select content from divination where id = ? AND deletedAt IS NULL");
                try {
                    x8cVarW3.Q(1, str);
                    if (x8cVarW3.R0()) {
                        String strT21 = x8cVarW3.isNull(0) ? null : x8cVarW3.t0(0);
                        fb4 fb4VarA4 = strT21 != null ? ((r0) vb4Var.d.b).a(strT21) : null;
                        if (fb4VarA4 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'ai.askquin.ui.persistence.query.DivinationContent', but it was NULL.");
                        }
                        wc4Var = new wc4(fb4VarA4);
                    }
                    x8cVarW3.close();
                    return wc4Var;
                } catch (Throwable th4) {
                    x8cVarW3.close();
                    throw th4;
                }
            default:
                q8c q8cVar5 = (q8c) obj;
                q8cVar5.getClass();
                x8c x8cVarW4 = q8cVar5.W0("select id,createAt,drawnAt,usedSkinType,summaryCards from divination where deletedAt IS NULL AND accountId = ? AND drawnAt is not null order by drawnAt desc");
                try {
                    x8cVarW4.Q(1, str);
                    ArrayList arrayList2 = new ArrayList();
                    while (x8cVarW4.R0()) {
                        String strT22 = x8cVarW4.t0(0);
                        String strT23 = x8cVarW4.isNull(1) ? null : x8cVarW4.t0(1);
                        yx4 yx4Var = vb4Var.b;
                        Instant instantI9 = yx4.i(strT23);
                        if (instantI9 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                        }
                        arrayList2.add(new yb4(strT22, instantI9, yx4.i(x8cVarW4.isNull(2) ? null : x8cVarW4.t0(2)), x8cVarW4.isNull(3) ? null : x8cVarW4.t0(3), d.b(x8cVarW4.isNull(4) ? null : x8cVarW4.t0(4))));
                    }
                    x8cVarW4.close();
                    return arrayList2;
                } catch (Throwable th5) {
                    x8cVarW4.close();
                    throw th5;
                }
        }
    }
}
