package ai.askquin.ui.persistence.database;

import ai.askquin.ui.persistence.database.DivinationDatabase_Impl;
import defpackage.ace;
import defpackage.bz6;
import defpackage.em7;
import defpackage.fba;
import defpackage.g6b;
import defpackage.gt4;
import defpackage.jb7;
import defpackage.job;
import defpackage.kob;
import defpackage.nb4;
import defpackage.pu4;
import defpackage.v74;
import defpackage.vc4;
import defpackage.x16;
import defpackage.xb4;
import defpackage.z7c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lai/askquin/ui/persistence/database/DivinationDatabase_Impl;", "Lai/askquin/ui/persistence/database/DivinationDatabase;", "<init>", "()V", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final class DivinationDatabase_Impl extends DivinationDatabase {
    public final ace l;
    public final ace m;
    public final ace n;
    public final ace o;
    public final ace p = new ace(new v74(this));

    public DivinationDatabase_Impl() {
        final int i = 0;
        this.l = new ace(new x16(this) { // from class: wb4
            public final /* synthetic */ DivinationDatabase_Impl b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                int i2 = i;
                DivinationDatabase_Impl divinationDatabase_Impl = this.b;
                switch (i2) {
                    case 0:
                        return new vb4(divinationDatabase_Impl);
                    case 1:
                        return new vc4(divinationDatabase_Impl);
                    case 2:
                        return new n6b(divinationDatabase_Impl);
                    default:
                        return new bz6(divinationDatabase_Impl);
                }
            }
        });
        final int i2 = 1;
        this.m = new ace(new x16(this) { // from class: wb4
            public final /* synthetic */ DivinationDatabase_Impl b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                int i3 = i2;
                DivinationDatabase_Impl divinationDatabase_Impl = this.b;
                switch (i3) {
                    case 0:
                        return new vb4(divinationDatabase_Impl);
                    case 1:
                        return new vc4(divinationDatabase_Impl);
                    case 2:
                        return new n6b(divinationDatabase_Impl);
                    default:
                        return new bz6(divinationDatabase_Impl);
                }
            }
        });
        final int i3 = 2;
        this.n = new ace(new x16(this) { // from class: wb4
            public final /* synthetic */ DivinationDatabase_Impl b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                int i4 = i3;
                DivinationDatabase_Impl divinationDatabase_Impl = this.b;
                switch (i4) {
                    case 0:
                        return new vb4(divinationDatabase_Impl);
                    case 1:
                        return new vc4(divinationDatabase_Impl);
                    case 2:
                        return new n6b(divinationDatabase_Impl);
                    default:
                        return new bz6(divinationDatabase_Impl);
                }
            }
        });
        final int i4 = 3;
        this.o = new ace(new x16(this) { // from class: wb4
            public final /* synthetic */ DivinationDatabase_Impl b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                int i5 = i4;
                DivinationDatabase_Impl divinationDatabase_Impl = this.b;
                switch (i5) {
                    case 0:
                        return new vb4(divinationDatabase_Impl);
                    case 1:
                        return new vc4(divinationDatabase_Impl);
                    case 2:
                        return new n6b(divinationDatabase_Impl);
                    default:
                        return new bz6(divinationDatabase_Impl);
                }
            }
        });
    }

    @Override // defpackage.w5c
    public final List c(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // defpackage.w5c
    public final jb7 d() {
        return new jb7(this, new LinkedHashMap(), new LinkedHashMap(), "divination", "DivinationPurchaseEntity", "divination_summary", "tb_in_app_message", "PersonalityReportEntity", "quick_decision");
    }

    @Override // defpackage.w5c
    public final gt4 e() {
        return new xb4(this);
    }

    @Override // defpackage.w5c
    public final Set i() {
        return new LinkedHashSet();
    }

    @Override // defpackage.w5c
    public final LinkedHashMap j() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        kob kobVar = job.a;
        em7 em7VarB = kobVar.b(nb4.class);
        pu4 pu4Var = pu4.a;
        linkedHashMap.put(em7VarB, pu4Var);
        linkedHashMap.put(kobVar.b(vc4.class), pu4Var);
        linkedHashMap.put(kobVar.b(g6b.class), pu4Var);
        linkedHashMap.put(kobVar.b(bz6.class), pu4Var);
        linkedHashMap.put(kobVar.b(fba.class), pu4Var);
        return linkedHashMap;
    }

    @Override // ai.askquin.ui.persistence.database.DivinationDatabase
    public final nb4 s() {
        return (nb4) this.l.getValue();
    }

    @Override // ai.askquin.ui.persistence.database.DivinationDatabase
    public final vc4 t() {
        return (vc4) this.m.getValue();
    }

    @Override // ai.askquin.ui.persistence.database.DivinationDatabase
    public final bz6 u() {
        return (bz6) this.o.getValue();
    }

    @Override // ai.askquin.ui.persistence.database.DivinationDatabase
    public final fba v() {
        return (fba) this.p.getValue();
    }

    @Override // ai.askquin.ui.persistence.database.DivinationDatabase
    public final g6b w() {
        return (g6b) this.n.getValue();
    }
}
