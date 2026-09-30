package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ec2 {
    public final List a;
    public final List b;
    public final List c;
    public List d;
    public List e;
    public final ace f;
    public final ace g;

    public ec2(List list, List list2, List list3, List list4, List list5) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
        final int i = 0;
        this.f = new ace(new x16(this) { // from class: cc2
            public final /* synthetic */ ec2 b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                int i2 = i;
                pu4 pu4Var = pu4.a;
                int i3 = 0;
                ec2 ec2Var = this.b;
                switch (i2) {
                    case 0:
                        List list6 = ec2Var.d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        while (i3 < size) {
                            x72.g0(arrayList, (List) ((x16) list6.get(i3)).invoke());
                            i3++;
                        }
                        ec2Var.d = pu4Var;
                        return arrayList;
                    default:
                        List list7 = ec2Var.e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        while (i3 < size2) {
                            x72.g0(arrayList2, (List) ((x16) list7.get(i3)).invoke());
                            i3++;
                        }
                        ec2Var.e = pu4Var;
                        return arrayList2;
                }
            }
        });
        final int i2 = 1;
        this.g = new ace(new x16(this) { // from class: cc2
            public final /* synthetic */ ec2 b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                int i3 = i2;
                pu4 pu4Var = pu4.a;
                int i4 = 0;
                ec2 ec2Var = this.b;
                switch (i3) {
                    case 0:
                        List list6 = ec2Var.d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        while (i4 < size) {
                            x72.g0(arrayList, (List) ((x16) list6.get(i4)).invoke());
                            i4++;
                        }
                        ec2Var.d = pu4Var;
                        return arrayList;
                    default:
                        List list7 = ec2Var.e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        while (i4 < size2) {
                            x72.g0(arrayList2, (List) ((x16) list7.get(i4)).invoke());
                            i4++;
                        }
                        ec2Var.e = pu4Var;
                        return arrayList2;
                }
            }
        });
    }
}
