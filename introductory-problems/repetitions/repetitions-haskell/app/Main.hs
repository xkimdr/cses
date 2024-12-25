module Main where

f :: [Char] -> Char -> Int -> Int -> Int
f [] _ c m = max c m
f (x : xs) p c m
  | p == x = f xs p (c + 1) m
  | otherwise = f xs x 1 (max c m)

main :: IO ()
main = do
  l <- getLine
  print (f l 'X' 1 1)