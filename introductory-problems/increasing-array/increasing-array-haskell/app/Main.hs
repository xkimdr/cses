module Main where

f :: [Int] -> Int -> Int
f (x : y : xs) c
  | x > y = f (x : xs) (c + x - y)
  | otherwise = f (y : xs) c
f _ c = c

main :: IO ()
main = do
  _ <- getLine
  l <- getLine
  print (f (map read (words l)) 0)
