package defpackage;

import ai.askquin.qa.bridge.Danger;
import ai.askquin.qa.bridge.QaResult;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public interface d3b {
    default dm1 a() {
        return dm1.b;
    }

    default Danger b() {
        return Danger.BENIGN;
    }

    QaResult c(ti7 ti7Var);

    default dm1 d(ti7 ti7Var) {
        return a();
    }

    String getId();

    default List getParams() {
        return pu4.a;
    }

    String getTitle();
}
