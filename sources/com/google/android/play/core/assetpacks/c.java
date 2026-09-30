package com.google.android.play.core.assetpacks;

import defpackage.mfg;
import defpackage.pgg;
import defpackage.ub3;
import defpackage.xeg;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends xeg {
    public final TreeMap a = new TreeMap();

    public c(File file, File file2) throws IOException {
        ArrayList<File> arrayListA = r.a(file, file2);
        if (arrayListA.isEmpty()) {
            throw new g(String.format("Virtualized slice archive empty for %s, %s", file, file2));
        }
        long length = 0;
        for (File file3 : arrayListA) {
            this.a.put(Long.valueOf(length), file3);
            length += file3.length();
        }
    }

    public final long b() {
        Map.Entry entryLastEntry = this.a.lastEntry();
        return ((File) entryLastEntry.getValue()).length() + ((Long) entryLastEntry.getKey()).longValue();
    }

    public final InputStream h(long j, long j2) {
        if (j < 0 || j2 < 0) {
            StringBuilder sbP = ub3.p("Invalid input parameters ", ", ", j);
            sbP.append(j2);
            throw new g(sbP.toString());
        }
        long j3 = j + j2;
        if (j3 > b()) {
            StringBuilder sbP2 = ub3.p("Trying to access archive out of bounds. Archive ends at: ", ". Tried accessing: ", b());
            sbP2.append(j3);
            throw new g(sbP2.toString());
        }
        Long lValueOf = Long.valueOf(j);
        TreeMap treeMap = this.a;
        Long l = (Long) treeMap.floorKey(lValueOf);
        Long l2 = (Long) treeMap.floorKey(Long.valueOf(j3));
        if (l.equals(l2)) {
            return new mfg(l(j, l), j2);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(l(j, l));
        Collection collectionValues = treeMap.subMap(l, false, l2, false).values();
        if (!collectionValues.isEmpty()) {
            arrayList.add(new pgg(Collections.enumeration(collectionValues)));
        }
        arrayList.add(new mfg(new FileInputStream((File) treeMap.get(l2)), j2 - (l2.longValue() - j)));
        return new SequenceInputStream(Collections.enumeration(arrayList));
    }

    public final FileInputStream l(long j, Long l) {
        FileInputStream fileInputStream = new FileInputStream((File) this.a.get(l));
        if (fileInputStream.skip(j - l.longValue()) == j - l.longValue()) {
            return fileInputStream;
        }
        throw new g("Virtualized slice archive corrupt, could not skip in file with key " + l);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
