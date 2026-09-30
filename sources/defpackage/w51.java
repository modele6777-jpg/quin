package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class w51 implements xj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jsd b;

    public /* synthetic */ w51(jsd jsdVar, int i) {
        this.a = i;
        this.b = jsdVar;
    }

    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        int i = this.a;
        wef wefVar = wef.a;
        jsd jsdVar = this.b;
        switch (i) {
            case 0:
                l77 l77Var = (l77) obj;
                if (l77Var instanceof yq6) {
                    jsdVar.add(l77Var);
                } else if (l77Var instanceof zq6) {
                    jsdVar.remove(((zq6) l77Var).a);
                } else if (l77Var instanceof rn5) {
                    jsdVar.add(l77Var);
                } else if (l77Var instanceof sn5) {
                    jsdVar.remove(((sn5) l77Var).a);
                } else if (l77Var instanceof pta) {
                    jsdVar.add(l77Var);
                } else if (l77Var instanceof qta) {
                    jsdVar.remove(((qta) l77Var).a);
                } else if (l77Var instanceof ota) {
                    jsdVar.remove(((ota) l77Var).a);
                }
                break;
            case 1:
                l77 l77Var2 = (l77) obj;
                if (l77Var2 instanceof yq6) {
                    jsdVar.add(l77Var2);
                } else if (l77Var2 instanceof zq6) {
                    jsdVar.remove(((zq6) l77Var2).a);
                } else if (l77Var2 instanceof rn5) {
                    jsdVar.add(l77Var2);
                } else if (l77Var2 instanceof sn5) {
                    jsdVar.remove(((sn5) l77Var2).a);
                } else if (l77Var2 instanceof pta) {
                    jsdVar.add(l77Var2);
                } else if (l77Var2 instanceof qta) {
                    jsdVar.remove(((qta) l77Var2).a);
                } else if (l77Var2 instanceof ota) {
                    jsdVar.remove(((ota) l77Var2).a);
                } else if (l77Var2 instanceof al4) {
                    jsdVar.add(l77Var2);
                } else if (l77Var2 instanceof bl4) {
                    jsdVar.remove(((bl4) l77Var2).a);
                } else if (l77Var2 instanceof zk4) {
                    jsdVar.remove(((zk4) l77Var2).a);
                }
                break;
            case 2:
                l77 l77Var3 = (l77) obj;
                if (l77Var3 instanceof yq6) {
                    jsdVar.add(l77Var3);
                } else if (l77Var3 instanceof zq6) {
                    jsdVar.remove(((zq6) l77Var3).a);
                } else if (l77Var3 instanceof rn5) {
                    jsdVar.add(l77Var3);
                } else if (l77Var3 instanceof sn5) {
                    jsdVar.remove(((sn5) l77Var3).a);
                } else if (l77Var3 instanceof pta) {
                    jsdVar.add(l77Var3);
                } else if (l77Var3 instanceof qta) {
                    jsdVar.remove(((qta) l77Var3).a);
                } else if (l77Var3 instanceof ota) {
                    jsdVar.remove(((ota) l77Var3).a);
                } else if (l77Var3 instanceof al4) {
                    jsdVar.add(l77Var3);
                } else if (l77Var3 instanceof bl4) {
                    jsdVar.remove(((bl4) l77Var3).a);
                } else if (l77Var3 instanceof zk4) {
                    jsdVar.remove(((zk4) l77Var3).a);
                }
                break;
            default:
                l77 l77Var4 = (l77) obj;
                if (l77Var4 instanceof pta) {
                    jsdVar.add(l77Var4);
                } else if (l77Var4 instanceof qta) {
                    jsdVar.remove(((qta) l77Var4).a);
                } else if (l77Var4 instanceof ota) {
                    jsdVar.remove(((ota) l77Var4).a);
                } else if (l77Var4 instanceof al4) {
                    jsdVar.add(l77Var4);
                } else if (l77Var4 instanceof bl4) {
                    jsdVar.remove(((bl4) l77Var4).a);
                } else if (l77Var4 instanceof zk4) {
                    jsdVar.remove(((zk4) l77Var4).a);
                }
                break;
        }
        return wefVar;
    }
}
