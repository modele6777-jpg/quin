package org.ocpsoft.prettytime.impl;

import defpackage.aye;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ResourcesTimeUnit implements aye {
    public static long d;
    public final long a;
    public long b = 0;
    public long c = 1;

    public ResourcesTimeUnit() {
        long j = d;
        d = 1 + j;
        this.a = j;
    }

    public abstract String a();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourcesTimeUnit resourcesTimeUnit = (ResourcesTimeUnit) obj;
        return this.b == resourcesTimeUnit.b && this.c == resourcesTimeUnit.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.a) + 31;
    }

    public final String toString() {
        return a();
    }
}
