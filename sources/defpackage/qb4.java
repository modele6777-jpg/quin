package defpackage;

import ai.askquin.ui.conversation.PhysicalDeckReading;
import ai.askquin.ui.conversation.SceneTarot;
import ai.askquin.ui.persistence.database.InterruptedDrawing;
import ai.askquin.ui.persistence.database.d;
import ai.askquin.ui.persistence.serialization.r0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qb4 extends oa7 {
    public final /* synthetic */ vb4 k;

    public qb4(vb4 vb4Var) {
        this.k = vb4Var;
    }

    @Override // defpackage.oa7
    public final String J() {
        return "INSERT INTO `divination` (`id`,`isLocalOnly`,`createAt`,`updateAt`,`drawnAt`,`title`,`messageCount`,`content`,`hasFeedback`,`sceneTarot`,`interruptedDrawing`,`divinationType`,`usedSkinType`,`aiRecommendedSpreads`,`selectedAiSpreadIndex`,`syncedAt`,`deletedAt`,`accountId`,`physicalDeckReading`,`previewMessage`,`readState`,`summaryCards`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    @Override // defpackage.oa7
    public final void p(x8c x8cVar, Object obj) {
        yc4 yc4Var = (yc4) obj;
        x8cVar.getClass();
        yc4Var.getClass();
        x8cVar.Q(1, yc4Var.a);
        x8cVar.m(2, yc4Var.b ? 1L : 0L);
        String strM = yx4.m(yc4Var.c);
        if (strM == null) {
            x8cVar.o(3);
        } else {
            x8cVar.Q(3, strM);
        }
        String strM2 = yx4.m(yc4Var.d);
        if (strM2 == null) {
            x8cVar.o(4);
        } else {
            x8cVar.Q(4, strM2);
        }
        String strM3 = yx4.m(yc4Var.e);
        if (strM3 == null) {
            x8cVar.o(5);
        } else {
            x8cVar.Q(5, strM3);
        }
        x8cVar.Q(6, yc4Var.f);
        x8cVar.m(7, yc4Var.g);
        ssg ssgVar = this.k.d;
        fb4 fb4Var = yc4Var.h;
        String strB = fb4Var == null ? null : ((r0) ssgVar.b).b(fb4Var);
        if (strB == null) {
            x8cVar.o(8);
        } else {
            x8cVar.Q(8, strB);
        }
        x8cVar.m(9, yc4Var.i ? 1L : 0L);
        SceneTarot sceneTarot = yc4Var.j;
        xh7 xh7Var = fzc.a;
        String strD = sceneTarot == null ? null : xh7Var.d(SceneTarot.Companion.serializer(), sceneTarot);
        if (strD == null) {
            x8cVar.o(10);
        } else {
            x8cVar.Q(10, strD);
        }
        InterruptedDrawing interruptedDrawing = yc4Var.k;
        String strD2 = interruptedDrawing == null ? null : xh7Var.d(InterruptedDrawing.Companion.serializer(), interruptedDrawing);
        if (strD2 == null) {
            x8cVar.o(11);
        } else {
            x8cVar.Q(11, strD2);
        }
        String str = yc4Var.l;
        if (str == null) {
            x8cVar.o(12);
        } else {
            x8cVar.Q(12, str);
        }
        String str2 = yc4Var.m;
        if (str2 == null) {
            x8cVar.o(13);
        } else {
            x8cVar.Q(13, str2);
        }
        List list = yc4Var.n;
        String strD3 = list == null ? null : xh7Var.d(ki.a, list);
        if (strD3 == null) {
            x8cVar.o(14);
        } else {
            x8cVar.Q(14, strD3);
        }
        Integer num = yc4Var.o;
        if (num == null) {
            x8cVar.o(15);
        } else {
            x8cVar.m(15, num.intValue());
        }
        String strM4 = yx4.m(yc4Var.p);
        if (strM4 == null) {
            x8cVar.o(16);
        } else {
            x8cVar.Q(16, strM4);
        }
        String strM5 = yx4.m(yc4Var.q);
        if (strM5 == null) {
            x8cVar.o(17);
        } else {
            x8cVar.Q(17, strM5);
        }
        x8cVar.Q(18, yc4Var.r);
        PhysicalDeckReading physicalDeckReading = yc4Var.s;
        String strD4 = physicalDeckReading != null ? xh7Var.d(PhysicalDeckReading.Companion.serializer(), physicalDeckReading) : null;
        if (strD4 == null) {
            x8cVar.o(19);
        } else {
            x8cVar.Q(19, strD4);
        }
        x8cVar.Q(20, yc4Var.t);
        tdb tdbVar = yc4Var.u;
        tdbVar.getClass();
        x8cVar.Q(21, tdbVar.name());
        String strA = d.a(yc4Var.v);
        if (strA == null) {
            x8cVar.o(22);
        } else {
            x8cVar.Q(22, strA);
        }
    }
}
