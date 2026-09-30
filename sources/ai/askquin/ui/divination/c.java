package ai.askquin.ui.divination;

import defpackage.em7;
import defpackage.job;
import defpackage.kic;
import defpackage.kob;
import defpackage.wn2;
import defpackage.xn7;
import java.lang.annotation.Annotation;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final /* synthetic */ c a = new c();

    public final xn7 serializer() {
        kob kobVar = job.a;
        return new kic("ai.askquin.ui.divination.OverviewItem", kobVar.b(OverviewItem.class), new em7[]{kobVar.b(OverviewItem.ClarifyingCardItem.class), kobVar.b(OverviewItem.ContinuationChatSlice.class), kobVar.b(OverviewItem.Divider.class), kobVar.b(OverviewItem.FailReason.class), kobVar.b(OverviewItem.Loading.class), kobVar.b(OverviewItem.NewReadingItem.class), kobVar.b(OverviewItem.ServerMessageItem.class), kobVar.b(OverviewItem.Share.class), kobVar.b(OverviewItem.UserMessageItem.class)}, new xn7[]{a.a, new wn2("ai.askquin.ui.divination.OverviewItem.ContinuationChatSlice", OverviewItem.ContinuationChatSlice.INSTANCE, new Annotation[0]), new wn2("ai.askquin.ui.divination.OverviewItem.Divider", OverviewItem.Divider.INSTANCE, new Annotation[0]), new wn2("ai.askquin.ui.divination.OverviewItem.FailReason", OverviewItem.FailReason.INSTANCE, new Annotation[0]), new wn2("ai.askquin.ui.divination.OverviewItem.Loading", OverviewItem.Loading.INSTANCE, new Annotation[0]), d.a, f.a, new wn2("ai.askquin.ui.divination.OverviewItem.Share", OverviewItem.Share.INSTANCE, new Annotation[0]), h.a}, new Annotation[0]);
    }
}
