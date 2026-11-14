#!/usr/bin/env bash
set -euo pipefail
ROOT="$(cd "$(dirname "$0")/.." && pwd)"
OUT="$ROOT/app/src/main/java/com/hyw/yfdinstaller/MainActivity.java"
PARTS_DIR="$ROOT/app/src/main/java/com/hyw/yfdinstaller"
cat "$PARTS_DIR/MainActivity.java.part0" \
    "$PARTS_DIR/MainActivity.java.part1" \
    "$PARTS_DIR/MainActivity.java.part2" \
    "$PARTS_DIR/MainActivity.java.part3" \
    "$PARTS_DIR/MainActivity.java.part4" > "$OUT"
echo "Wrote $OUT ($(wc -c < "$OUT") bytes)"
