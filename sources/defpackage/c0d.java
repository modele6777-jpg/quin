package defpackage;

import android.media.MediaCodec;
import android.util.Log;
import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c0d {
    public final Collection a;
    public final boolean b;
    public final ace c;
    public final ace d;
    public final ace e;
    public final ace f;
    public final ace g;

    public c0d(Collection collection, boolean z) {
        collection.getClass();
        this.a = collection;
        this.b = z;
        final int i = 0;
        this.c = new ace(new x16(this) { // from class: a0d
            public final /* synthetic */ c0d b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:101:0x027a  */
            /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Instruction removed from duplicated block: B:101:0x027a, please report this as an issue */
            @Override // defpackage.x16
            public final Object invoke() {
                int i2 = i;
                c0d c0dVar = this.b;
                switch (i2) {
                    case 0:
                        ArrayList<zzc> arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (oif oifVar : c0dVar.a) {
                            boolean z2 = c0dVar.b;
                            oifVar.getClass();
                            zzc zzcVar = z2 ? oifVar.p : oifVar.q;
                            zzcVar.getClass();
                            arrayList.add(zzcVar);
                            xjf xjfVar = oifVar.i;
                            xjfVar.getClass();
                            arrayList2.add(xjfVar);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((zzc) it.next()).g.c == 5) {
                                    if (b21.F(6, "CXCP")) {
                                        b1.d("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                    }
                                    return qu4.a;
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        no0 no0Var = o3e.a;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        for (zzc zzcVar2 : arrayList) {
                            if (zzcVar2.g.b.a.containsKey(no0Var) && zzcVar2.b().size() != 1) {
                                if (!b21.F(6, "CXCP")) {
                                    return linkedHashMap;
                                }
                                b1.d("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + zzcVar2.b().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                return linkedHashMap;
                            }
                            if (zzcVar2.g.b.a.containsKey(no0Var)) {
                                int i3 = 0;
                                for (zzc zzcVar3 : arrayList) {
                                    if (((xjf) arrayList3.get(i3)).s() == zjf.f) {
                                        List listB = zzcVar3.b();
                                        listB.getClass();
                                        ok8.o("MeteringRepeating should contain a surface", !listB.isEmpty());
                                        linkedHashMap.put(zzcVar3.b().get(0), 1L);
                                    } else if (zzcVar3.g.b.a.containsKey(no0Var)) {
                                        List listB2 = zzcVar3.b();
                                        listB2.getClass();
                                        if (!listB2.isEmpty()) {
                                            Object obj = zzcVar3.b().get(0);
                                            Object objC = zzcVar3.g.b.c(no0Var);
                                            objC.getClass();
                                            linkedHashMap.put(obj, objC);
                                        }
                                    }
                                    i3++;
                                }
                                if (b21.F(3, "CXCP")) {
                                    return linkedHashMap;
                                }
                                Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                                return linkedHashMap;
                            }
                        }
                        if (b21.F(3, "CXCP")) {
                            return linkedHashMap;
                        }
                        Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                        return linkedHashMap;
                    case 1:
                        Collection<oif> collection2 = c0dVar.a;
                        ArrayList<zzc> arrayList4 = new ArrayList(t72.u(collection2, 10));
                        for (oif oifVar2 : collection2) {
                            boolean z3 = c0dVar.b;
                            oifVar2.getClass();
                            zzc zzcVar4 = z3 ? oifVar2.p : oifVar2.q;
                            zzcVar4.getClass();
                            arrayList4.add(zzcVar4);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (zzc zzcVar5 : arrayList4) {
                            List<lu3> listB3 = zzcVar5.b();
                            im1 im1Var = zzcVar5.g;
                            for (lu3 lu3Var : listB3) {
                                bs9 bs9Var = im1Var.b;
                                no0 no0Var2 = od1.w;
                                if (!bs9Var.a.containsKey(no0Var2) || bs9Var.c(no0Var2) == null) {
                                    linkedHashMap2.put(lu3Var, Long.valueOf(pa7.t(lu3Var.j, MediaCodec.class) ? 1L : 0L));
                                } else {
                                    Object objC2 = bs9Var.c(no0Var2);
                                    objC2.getClass();
                                    linkedHashMap2.put(lu3Var, objC2);
                                }
                            }
                        }
                        return linkedHashMap2;
                    case 2:
                        yzc yzcVar = new yzc();
                        for (oif oifVar3 : c0dVar.a) {
                            boolean z4 = c0dVar.b;
                            oifVar3.getClass();
                            zzc zzcVar6 = z4 ? oifVar3.p : oifVar3.q;
                            zzcVar6.getClass();
                            yzcVar.a(zzcVar6);
                        }
                        return yzcVar;
                    case 3:
                        ace aceVar = c0dVar.e;
                        if (((yzc) aceVar.getValue()).c()) {
                            return ((yzc) aceVar.getValue()).b();
                        }
                        qc0.p("Check failed.");
                        return null;
                    default:
                        ace aceVar2 = c0dVar.f;
                        if (!((yzc) c0dVar.e.getValue()).c()) {
                            qc0.p("Check failed.");
                            return null;
                        }
                        eq0 eq0Var = ((zzc) aceVar2.getValue()).b;
                        if (eq0Var != null) {
                            ArrayList arrayList5 = new ArrayList();
                            List listB4 = ((zzc) aceVar2.getValue()).b();
                            listB4.getClass();
                            arrayList5.addAll(listB4);
                            lu3 lu3Var2 = eq0Var.a;
                            lu3Var2.getClass();
                            arrayList5.add(lu3Var2);
                            List listUnmodifiableList = Collections.unmodifiableList(arrayList5);
                            if (listUnmodifiableList != null) {
                                return listUnmodifiableList;
                            }
                        }
                        return ((zzc) aceVar2.getValue()).b();
                }
            }
        });
        final int i2 = 1;
        this.d = new ace(new x16(this) { // from class: a0d
            public final /* synthetic */ c0d b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:101:0x027a  */
            /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Instruction removed from duplicated block: B:101:0x027a, please report this as an issue */
            @Override // defpackage.x16
            public final Object invoke() {
                int i3 = i2;
                c0d c0dVar = this.b;
                switch (i3) {
                    case 0:
                        ArrayList<zzc> arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (oif oifVar : c0dVar.a) {
                            boolean z2 = c0dVar.b;
                            oifVar.getClass();
                            zzc zzcVar = z2 ? oifVar.p : oifVar.q;
                            zzcVar.getClass();
                            arrayList.add(zzcVar);
                            xjf xjfVar = oifVar.i;
                            xjfVar.getClass();
                            arrayList2.add(xjfVar);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((zzc) it.next()).g.c == 5) {
                                    if (b21.F(6, "CXCP")) {
                                        b1.d("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                    }
                                    return qu4.a;
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        no0 no0Var = o3e.a;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        for (zzc zzcVar2 : arrayList) {
                            if (zzcVar2.g.b.a.containsKey(no0Var) && zzcVar2.b().size() != 1) {
                                if (!b21.F(6, "CXCP")) {
                                    return linkedHashMap;
                                }
                                b1.d("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + zzcVar2.b().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                return linkedHashMap;
                            }
                            if (zzcVar2.g.b.a.containsKey(no0Var)) {
                                int i4 = 0;
                                for (zzc zzcVar3 : arrayList) {
                                    if (((xjf) arrayList3.get(i4)).s() == zjf.f) {
                                        List listB = zzcVar3.b();
                                        listB.getClass();
                                        ok8.o("MeteringRepeating should contain a surface", !listB.isEmpty());
                                        linkedHashMap.put(zzcVar3.b().get(0), 1L);
                                    } else if (zzcVar3.g.b.a.containsKey(no0Var)) {
                                        List listB2 = zzcVar3.b();
                                        listB2.getClass();
                                        if (!listB2.isEmpty()) {
                                            Object obj = zzcVar3.b().get(0);
                                            Object objC = zzcVar3.g.b.c(no0Var);
                                            objC.getClass();
                                            linkedHashMap.put(obj, objC);
                                        }
                                    }
                                    i4++;
                                }
                                if (b21.F(3, "CXCP")) {
                                    return linkedHashMap;
                                }
                                Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                                return linkedHashMap;
                            }
                        }
                        if (b21.F(3, "CXCP")) {
                            return linkedHashMap;
                        }
                        Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                        return linkedHashMap;
                    case 1:
                        Collection<oif> collection2 = c0dVar.a;
                        ArrayList<zzc> arrayList4 = new ArrayList(t72.u(collection2, 10));
                        for (oif oifVar2 : collection2) {
                            boolean z3 = c0dVar.b;
                            oifVar2.getClass();
                            zzc zzcVar4 = z3 ? oifVar2.p : oifVar2.q;
                            zzcVar4.getClass();
                            arrayList4.add(zzcVar4);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (zzc zzcVar5 : arrayList4) {
                            List<lu3> listB3 = zzcVar5.b();
                            im1 im1Var = zzcVar5.g;
                            for (lu3 lu3Var : listB3) {
                                bs9 bs9Var = im1Var.b;
                                no0 no0Var2 = od1.w;
                                if (!bs9Var.a.containsKey(no0Var2) || bs9Var.c(no0Var2) == null) {
                                    linkedHashMap2.put(lu3Var, Long.valueOf(pa7.t(lu3Var.j, MediaCodec.class) ? 1L : 0L));
                                } else {
                                    Object objC2 = bs9Var.c(no0Var2);
                                    objC2.getClass();
                                    linkedHashMap2.put(lu3Var, objC2);
                                }
                            }
                        }
                        return linkedHashMap2;
                    case 2:
                        yzc yzcVar = new yzc();
                        for (oif oifVar3 : c0dVar.a) {
                            boolean z4 = c0dVar.b;
                            oifVar3.getClass();
                            zzc zzcVar6 = z4 ? oifVar3.p : oifVar3.q;
                            zzcVar6.getClass();
                            yzcVar.a(zzcVar6);
                        }
                        return yzcVar;
                    case 3:
                        ace aceVar = c0dVar.e;
                        if (((yzc) aceVar.getValue()).c()) {
                            return ((yzc) aceVar.getValue()).b();
                        }
                        qc0.p("Check failed.");
                        return null;
                    default:
                        ace aceVar2 = c0dVar.f;
                        if (!((yzc) c0dVar.e.getValue()).c()) {
                            qc0.p("Check failed.");
                            return null;
                        }
                        eq0 eq0Var = ((zzc) aceVar2.getValue()).b;
                        if (eq0Var != null) {
                            ArrayList arrayList5 = new ArrayList();
                            List listB4 = ((zzc) aceVar2.getValue()).b();
                            listB4.getClass();
                            arrayList5.addAll(listB4);
                            lu3 lu3Var2 = eq0Var.a;
                            lu3Var2.getClass();
                            arrayList5.add(lu3Var2);
                            List listUnmodifiableList = Collections.unmodifiableList(arrayList5);
                            if (listUnmodifiableList != null) {
                                return listUnmodifiableList;
                            }
                        }
                        return ((zzc) aceVar2.getValue()).b();
                }
            }
        });
        final int i3 = 2;
        this.e = new ace(new x16(this) { // from class: a0d
            public final /* synthetic */ c0d b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:101:0x027a  */
            /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Instruction removed from duplicated block: B:101:0x027a, please report this as an issue */
            @Override // defpackage.x16
            public final Object invoke() {
                int i4 = i3;
                c0d c0dVar = this.b;
                switch (i4) {
                    case 0:
                        ArrayList<zzc> arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (oif oifVar : c0dVar.a) {
                            boolean z2 = c0dVar.b;
                            oifVar.getClass();
                            zzc zzcVar = z2 ? oifVar.p : oifVar.q;
                            zzcVar.getClass();
                            arrayList.add(zzcVar);
                            xjf xjfVar = oifVar.i;
                            xjfVar.getClass();
                            arrayList2.add(xjfVar);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((zzc) it.next()).g.c == 5) {
                                    if (b21.F(6, "CXCP")) {
                                        b1.d("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                    }
                                    return qu4.a;
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        no0 no0Var = o3e.a;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        for (zzc zzcVar2 : arrayList) {
                            if (zzcVar2.g.b.a.containsKey(no0Var) && zzcVar2.b().size() != 1) {
                                if (!b21.F(6, "CXCP")) {
                                    return linkedHashMap;
                                }
                                b1.d("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + zzcVar2.b().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                return linkedHashMap;
                            }
                            if (zzcVar2.g.b.a.containsKey(no0Var)) {
                                int i5 = 0;
                                for (zzc zzcVar3 : arrayList) {
                                    if (((xjf) arrayList3.get(i5)).s() == zjf.f) {
                                        List listB = zzcVar3.b();
                                        listB.getClass();
                                        ok8.o("MeteringRepeating should contain a surface", !listB.isEmpty());
                                        linkedHashMap.put(zzcVar3.b().get(0), 1L);
                                    } else if (zzcVar3.g.b.a.containsKey(no0Var)) {
                                        List listB2 = zzcVar3.b();
                                        listB2.getClass();
                                        if (!listB2.isEmpty()) {
                                            Object obj = zzcVar3.b().get(0);
                                            Object objC = zzcVar3.g.b.c(no0Var);
                                            objC.getClass();
                                            linkedHashMap.put(obj, objC);
                                        }
                                    }
                                    i5++;
                                }
                                if (b21.F(3, "CXCP")) {
                                    return linkedHashMap;
                                }
                                Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                                return linkedHashMap;
                            }
                        }
                        if (b21.F(3, "CXCP")) {
                            return linkedHashMap;
                        }
                        Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                        return linkedHashMap;
                    case 1:
                        Collection<oif> collection2 = c0dVar.a;
                        ArrayList<zzc> arrayList4 = new ArrayList(t72.u(collection2, 10));
                        for (oif oifVar2 : collection2) {
                            boolean z3 = c0dVar.b;
                            oifVar2.getClass();
                            zzc zzcVar4 = z3 ? oifVar2.p : oifVar2.q;
                            zzcVar4.getClass();
                            arrayList4.add(zzcVar4);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (zzc zzcVar5 : arrayList4) {
                            List<lu3> listB3 = zzcVar5.b();
                            im1 im1Var = zzcVar5.g;
                            for (lu3 lu3Var : listB3) {
                                bs9 bs9Var = im1Var.b;
                                no0 no0Var2 = od1.w;
                                if (!bs9Var.a.containsKey(no0Var2) || bs9Var.c(no0Var2) == null) {
                                    linkedHashMap2.put(lu3Var, Long.valueOf(pa7.t(lu3Var.j, MediaCodec.class) ? 1L : 0L));
                                } else {
                                    Object objC2 = bs9Var.c(no0Var2);
                                    objC2.getClass();
                                    linkedHashMap2.put(lu3Var, objC2);
                                }
                            }
                        }
                        return linkedHashMap2;
                    case 2:
                        yzc yzcVar = new yzc();
                        for (oif oifVar3 : c0dVar.a) {
                            boolean z4 = c0dVar.b;
                            oifVar3.getClass();
                            zzc zzcVar6 = z4 ? oifVar3.p : oifVar3.q;
                            zzcVar6.getClass();
                            yzcVar.a(zzcVar6);
                        }
                        return yzcVar;
                    case 3:
                        ace aceVar = c0dVar.e;
                        if (((yzc) aceVar.getValue()).c()) {
                            return ((yzc) aceVar.getValue()).b();
                        }
                        qc0.p("Check failed.");
                        return null;
                    default:
                        ace aceVar2 = c0dVar.f;
                        if (!((yzc) c0dVar.e.getValue()).c()) {
                            qc0.p("Check failed.");
                            return null;
                        }
                        eq0 eq0Var = ((zzc) aceVar2.getValue()).b;
                        if (eq0Var != null) {
                            ArrayList arrayList5 = new ArrayList();
                            List listB4 = ((zzc) aceVar2.getValue()).b();
                            listB4.getClass();
                            arrayList5.addAll(listB4);
                            lu3 lu3Var2 = eq0Var.a;
                            lu3Var2.getClass();
                            arrayList5.add(lu3Var2);
                            List listUnmodifiableList = Collections.unmodifiableList(arrayList5);
                            if (listUnmodifiableList != null) {
                                return listUnmodifiableList;
                            }
                        }
                        return ((zzc) aceVar2.getValue()).b();
                }
            }
        });
        final int i4 = 3;
        this.f = new ace(new x16(this) { // from class: a0d
            public final /* synthetic */ c0d b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:101:0x027a  */
            /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Instruction removed from duplicated block: B:101:0x027a, please report this as an issue */
            @Override // defpackage.x16
            public final Object invoke() {
                int i5 = i4;
                c0d c0dVar = this.b;
                switch (i5) {
                    case 0:
                        ArrayList<zzc> arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (oif oifVar : c0dVar.a) {
                            boolean z2 = c0dVar.b;
                            oifVar.getClass();
                            zzc zzcVar = z2 ? oifVar.p : oifVar.q;
                            zzcVar.getClass();
                            arrayList.add(zzcVar);
                            xjf xjfVar = oifVar.i;
                            xjfVar.getClass();
                            arrayList2.add(xjfVar);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((zzc) it.next()).g.c == 5) {
                                    if (b21.F(6, "CXCP")) {
                                        b1.d("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                    }
                                    return qu4.a;
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        no0 no0Var = o3e.a;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        for (zzc zzcVar2 : arrayList) {
                            if (zzcVar2.g.b.a.containsKey(no0Var) && zzcVar2.b().size() != 1) {
                                if (!b21.F(6, "CXCP")) {
                                    return linkedHashMap;
                                }
                                b1.d("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + zzcVar2.b().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                return linkedHashMap;
                            }
                            if (zzcVar2.g.b.a.containsKey(no0Var)) {
                                int i6 = 0;
                                for (zzc zzcVar3 : arrayList) {
                                    if (((xjf) arrayList3.get(i6)).s() == zjf.f) {
                                        List listB = zzcVar3.b();
                                        listB.getClass();
                                        ok8.o("MeteringRepeating should contain a surface", !listB.isEmpty());
                                        linkedHashMap.put(zzcVar3.b().get(0), 1L);
                                    } else if (zzcVar3.g.b.a.containsKey(no0Var)) {
                                        List listB2 = zzcVar3.b();
                                        listB2.getClass();
                                        if (!listB2.isEmpty()) {
                                            Object obj = zzcVar3.b().get(0);
                                            Object objC = zzcVar3.g.b.c(no0Var);
                                            objC.getClass();
                                            linkedHashMap.put(obj, objC);
                                        }
                                    }
                                    i6++;
                                }
                                if (b21.F(3, "CXCP")) {
                                    return linkedHashMap;
                                }
                                Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                                return linkedHashMap;
                            }
                        }
                        if (b21.F(3, "CXCP")) {
                            return linkedHashMap;
                        }
                        Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                        return linkedHashMap;
                    case 1:
                        Collection<oif> collection2 = c0dVar.a;
                        ArrayList<zzc> arrayList4 = new ArrayList(t72.u(collection2, 10));
                        for (oif oifVar2 : collection2) {
                            boolean z3 = c0dVar.b;
                            oifVar2.getClass();
                            zzc zzcVar4 = z3 ? oifVar2.p : oifVar2.q;
                            zzcVar4.getClass();
                            arrayList4.add(zzcVar4);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (zzc zzcVar5 : arrayList4) {
                            List<lu3> listB3 = zzcVar5.b();
                            im1 im1Var = zzcVar5.g;
                            for (lu3 lu3Var : listB3) {
                                bs9 bs9Var = im1Var.b;
                                no0 no0Var2 = od1.w;
                                if (!bs9Var.a.containsKey(no0Var2) || bs9Var.c(no0Var2) == null) {
                                    linkedHashMap2.put(lu3Var, Long.valueOf(pa7.t(lu3Var.j, MediaCodec.class) ? 1L : 0L));
                                } else {
                                    Object objC2 = bs9Var.c(no0Var2);
                                    objC2.getClass();
                                    linkedHashMap2.put(lu3Var, objC2);
                                }
                            }
                        }
                        return linkedHashMap2;
                    case 2:
                        yzc yzcVar = new yzc();
                        for (oif oifVar3 : c0dVar.a) {
                            boolean z4 = c0dVar.b;
                            oifVar3.getClass();
                            zzc zzcVar6 = z4 ? oifVar3.p : oifVar3.q;
                            zzcVar6.getClass();
                            yzcVar.a(zzcVar6);
                        }
                        return yzcVar;
                    case 3:
                        ace aceVar = c0dVar.e;
                        if (((yzc) aceVar.getValue()).c()) {
                            return ((yzc) aceVar.getValue()).b();
                        }
                        qc0.p("Check failed.");
                        return null;
                    default:
                        ace aceVar2 = c0dVar.f;
                        if (!((yzc) c0dVar.e.getValue()).c()) {
                            qc0.p("Check failed.");
                            return null;
                        }
                        eq0 eq0Var = ((zzc) aceVar2.getValue()).b;
                        if (eq0Var != null) {
                            ArrayList arrayList5 = new ArrayList();
                            List listB4 = ((zzc) aceVar2.getValue()).b();
                            listB4.getClass();
                            arrayList5.addAll(listB4);
                            lu3 lu3Var2 = eq0Var.a;
                            lu3Var2.getClass();
                            arrayList5.add(lu3Var2);
                            List listUnmodifiableList = Collections.unmodifiableList(arrayList5);
                            if (listUnmodifiableList != null) {
                                return listUnmodifiableList;
                            }
                        }
                        return ((zzc) aceVar2.getValue()).b();
                }
            }
        });
        final int i5 = 4;
        this.g = new ace(new x16(this) { // from class: a0d
            public final /* synthetic */ c0d b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:101:0x027a  */
            /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Instruction removed from duplicated block: B:101:0x027a, please report this as an issue */
            @Override // defpackage.x16
            public final Object invoke() {
                int i6 = i5;
                c0d c0dVar = this.b;
                switch (i6) {
                    case 0:
                        ArrayList<zzc> arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (oif oifVar : c0dVar.a) {
                            boolean z2 = c0dVar.b;
                            oifVar.getClass();
                            zzc zzcVar = z2 ? oifVar.p : oifVar.q;
                            zzcVar.getClass();
                            arrayList.add(zzcVar);
                            xjf xjfVar = oifVar.i;
                            xjfVar.getClass();
                            arrayList2.add(xjfVar);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((zzc) it.next()).g.c == 5) {
                                    if (b21.F(6, "CXCP")) {
                                        b1.d("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                    }
                                    return qu4.a;
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        no0 no0Var = o3e.a;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        for (zzc zzcVar2 : arrayList) {
                            if (zzcVar2.g.b.a.containsKey(no0Var) && zzcVar2.b().size() != 1) {
                                if (!b21.F(6, "CXCP")) {
                                    return linkedHashMap;
                                }
                                b1.d("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + zzcVar2.b().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                return linkedHashMap;
                            }
                            if (zzcVar2.g.b.a.containsKey(no0Var)) {
                                int i7 = 0;
                                for (zzc zzcVar3 : arrayList) {
                                    if (((xjf) arrayList3.get(i7)).s() == zjf.f) {
                                        List listB = zzcVar3.b();
                                        listB.getClass();
                                        ok8.o("MeteringRepeating should contain a surface", !listB.isEmpty());
                                        linkedHashMap.put(zzcVar3.b().get(0), 1L);
                                    } else if (zzcVar3.g.b.a.containsKey(no0Var)) {
                                        List listB2 = zzcVar3.b();
                                        listB2.getClass();
                                        if (!listB2.isEmpty()) {
                                            Object obj = zzcVar3.b().get(0);
                                            Object objC = zzcVar3.g.b.c(no0Var);
                                            objC.getClass();
                                            linkedHashMap.put(obj, objC);
                                        }
                                    }
                                    i7++;
                                }
                                if (b21.F(3, "CXCP")) {
                                    return linkedHashMap;
                                }
                                Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                                return linkedHashMap;
                            }
                        }
                        if (b21.F(3, "CXCP")) {
                            return linkedHashMap;
                        }
                        Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                        return linkedHashMap;
                    case 1:
                        Collection<oif> collection2 = c0dVar.a;
                        ArrayList<zzc> arrayList4 = new ArrayList(t72.u(collection2, 10));
                        for (oif oifVar2 : collection2) {
                            boolean z3 = c0dVar.b;
                            oifVar2.getClass();
                            zzc zzcVar4 = z3 ? oifVar2.p : oifVar2.q;
                            zzcVar4.getClass();
                            arrayList4.add(zzcVar4);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (zzc zzcVar5 : arrayList4) {
                            List<lu3> listB3 = zzcVar5.b();
                            im1 im1Var = zzcVar5.g;
                            for (lu3 lu3Var : listB3) {
                                bs9 bs9Var = im1Var.b;
                                no0 no0Var2 = od1.w;
                                if (!bs9Var.a.containsKey(no0Var2) || bs9Var.c(no0Var2) == null) {
                                    linkedHashMap2.put(lu3Var, Long.valueOf(pa7.t(lu3Var.j, MediaCodec.class) ? 1L : 0L));
                                } else {
                                    Object objC2 = bs9Var.c(no0Var2);
                                    objC2.getClass();
                                    linkedHashMap2.put(lu3Var, objC2);
                                }
                            }
                        }
                        return linkedHashMap2;
                    case 2:
                        yzc yzcVar = new yzc();
                        for (oif oifVar3 : c0dVar.a) {
                            boolean z4 = c0dVar.b;
                            oifVar3.getClass();
                            zzc zzcVar6 = z4 ? oifVar3.p : oifVar3.q;
                            zzcVar6.getClass();
                            yzcVar.a(zzcVar6);
                        }
                        return yzcVar;
                    case 3:
                        ace aceVar = c0dVar.e;
                        if (((yzc) aceVar.getValue()).c()) {
                            return ((yzc) aceVar.getValue()).b();
                        }
                        qc0.p("Check failed.");
                        return null;
                    default:
                        ace aceVar2 = c0dVar.f;
                        if (!((yzc) c0dVar.e.getValue()).c()) {
                            qc0.p("Check failed.");
                            return null;
                        }
                        eq0 eq0Var = ((zzc) aceVar2.getValue()).b;
                        if (eq0Var != null) {
                            ArrayList arrayList5 = new ArrayList();
                            List listB4 = ((zzc) aceVar2.getValue()).b();
                            listB4.getClass();
                            arrayList5.addAll(listB4);
                            lu3 lu3Var2 = eq0Var.a;
                            lu3Var2.getClass();
                            arrayList5.add(lu3Var2);
                            List listUnmodifiableList = Collections.unmodifiableList(arrayList5);
                            if (listUnmodifiableList != null) {
                                return listUnmodifiableList;
                            }
                        }
                        return ((zzc) aceVar2.getValue()).b();
                }
            }
        });
    }

    public final void a(lu3 lu3Var) {
        Object next;
        zzc zzcVar;
        lu3Var.getClass();
        if (b21.F(3, "CXCP")) {
            Log.d("CXCP", "Unavailable " + lu3Var + ", notify SessionConfig invalid");
        }
        Iterator it = this.a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            oif oifVar = (oif) next;
            oifVar.getClass();
            zzcVar = this.b ? oifVar.p : oifVar.q;
            zzcVar.getClass();
        } while (!zzcVar.b().contains(lu3Var));
        oif oifVar2 = (oif) next;
        zzc zzcVar2 = oifVar2 != null ? oifVar2.p : null;
        js3 js3Var = ga4.a;
        ynb.V(jgb.k(mk8.a.f), null, null, new b0d(zzcVar2, null), 3);
    }
}
