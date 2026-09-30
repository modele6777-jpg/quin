package ai.askquin.ui.persistence.serialization;

import defpackage.em7;
import defpackage.job;
import defpackage.kic;
import defpackage.kob;
import defpackage.xn7;
import java.lang.annotation.Annotation;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static final /* synthetic */ k a = new k();

    public final xn7 serializer() {
        kob kobVar = job.a;
        return new kic("ai.askquin.ui.persistence.serialization.SerializableDivinationState.Patternable", kobVar.b(SerializableDivinationState.Patternable.class), new em7[]{kobVar.b(SerializableDivinationState.WaitAdditionalInfo.class), kobVar.b(SerializableDivinationState.WaitConfirm.class)}, new xn7[]{n.a, p.a}, new Annotation[0]);
    }
}
