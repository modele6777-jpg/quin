package ai.askquin.qa.bridge;

import defpackage.em7;
import defpackage.job;
import defpackage.kic;
import defpackage.kob;
import defpackage.xn7;
import java.lang.annotation.Annotation;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final /* synthetic */ b a = new b();

    public final xn7 serializer() {
        kob kobVar = job.a;
        return new kic("ai.askquin.qa.bridge.QaResult", kobVar.b(QaResult.class), new em7[]{kobVar.b(QaResult.Err.class), kobVar.b(QaResult.Ok.class)}, new xn7[]{c.a, e.a}, new Annotation[0]);
    }
}
